package section3

// 리스트의 숫자를 뒤집어서 반환하는 solution 을 만드세요

fun main(){

    val arr1 = arrayListOf(1,2,3,4,5)
    val result1 = solution(arr1)
    println(result1)
    // [5,4,3,2,1]

    val arr2 = arrayListOf(2,4,6,8)
    val result2 = solution(arr2)
    println(result2)
    //  [8,6,4,2]

}


fun solution(arr: ArrayList<Int>) :ArrayList <String> {
    val resultArr = ArrayList <String>()
    resultArr.add(arr.reversed().toString())

    return resultArr
}