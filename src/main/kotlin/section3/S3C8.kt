package section3
// 문자의 갯수를 세는 solution을 만들어주세요
// 문자열이 많이 나온 순서대로 정렬됩니다.
// 문자열 갯수가 같은 경우는 없다고 가정합니다. (a 는 5개 b 는 5개 이런 경우는 없습니다.)

fun main(){

    val result1 = solution8("aabbaabccbb")
    println(result1)
    // {b=5, a=4, c=2}

    val result2 = solution8("ccddcddaaq")
    println(result2)
    // {d=4, c=3, a=2, q=1}

}


fun solution8( str : String ): Map<String, Int> {

    // 문자열에 어떤 알파벳이 있는지 찾고 리스트에 넣기
    val resultArr = mutableListOf<String>()
    for(i in str) {
        resultArr.add(i.toString())
    }

    //중복 문자열 제거
    val distinctList = resultArr.distinct()

    val countList =  mutableListOf<Int>()
    // 어떤 알파벳이 몇번 사용되었는지 세기
    for (i in distinctList){ // a b c
        val count = resultArr.filter { it == i}.count()

        countList.add(count)
    }

    // 알파벳이 많이 나온 순서대로 정렬
    val resultMap = mutableMapOf<String, Int>()

    for (i in 0..distinctList.count() - 1){
        resultMap[distinctList[i]] = countList[i]
    }

    return resultMap.toList().sortedBy {it.second}.reversed().toMap()
}



