package section3
// 리스트의 가장 작은 숫자를 찾아서 제거하고
// 남은 숫자들을 모두 더해서 값을 출력해주는 함수를 만드세요

fun main(){

    val input1 = arrayListOf(1,2,3,4,5)
    val result1 = solution9(input1)
    println(result1)
    // 14

    val input2 = arrayListOf(10,8,6,4,2)
    val result2 = solution9(input2)
    println(result2)
    // 28

    val input3 = arrayListOf(6, 3, 9)
    val result3 = solution9(input3)
    println(result3)
    // 15

}


fun solution9(list: ArrayList<Int>) : Int{
    val result : Int = 0
    //리스트의 가장 작은 숫자를 찾기
    var arrMin = list.minOrNull()
    var sumResult = 0

    //가장 작은 숫자 제외한 남은 값들 덧셈 후 출력
    for(i in list){
        if(i == arrMin){
            sumResult -= i
        }
        sumResult += i
    }

    return sumResult
}
