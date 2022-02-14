package section3
// 가장 가까운 사람의 이름을 알려주는 함수를 완성하세요
// 거리는 음수가 아닙니다 / 같은 거리는 없습니다.

fun main(){

    val result1 = solution10("민수 : 3, 민지  : 4, 찬혁 : 1.5, 지우 : 2")
    println(result1)
    // 찬혁

    val result2 = solution10("지영 : 3.7, 민영  : 1.2 , 해피 : 2.7, 퍼니 : 3")
    println(result2)
    // 민영

}


fun solution10(str: String) : String{
    val result = str.split(",")

    val nameList = mutableListOf<String>()
    val distanceList = mutableListOf<Double>()

    for(i in result){
        val name = i.split(":")[0]
        val distance = i.split(":")[1].toDouble()

        nameList.add(name)
        distanceList.add(distance)
    }

    //최소값 찾기
    val minDistance = distanceList.minOrNull()
    //최소값의 인덱스를 찾기
    val resultIndex = distanceList.indexOf(minDistance)


    return nameList[resultIndex].trim()
}

