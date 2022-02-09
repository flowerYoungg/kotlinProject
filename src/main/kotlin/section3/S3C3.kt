package section3

// 문자열의 숫자와 짝수(true)와 홀수(false)를 알려주는 solution을 만드세요

fun main(){

    val result1 = solution("abcd")
    println(result1)
    // [4, true]

    val result2 = solution("abcde")
    println(result2)
    // [5, false]
}


fun solution(str : String) : ArrayList<String> {

    val length =str.length
    var result = true

    if(length/2 == 0){
        result = true
    }else {
        result = false
    }

    val resultArray = arrayListOf<String>(length.toString(), result.toString())

    return resultArray
}