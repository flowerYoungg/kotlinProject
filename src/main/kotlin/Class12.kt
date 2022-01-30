//간단한 계산기 문제
fun main() {
    remainder(5, 2)
}

fun sumTwo(num1 : Int, num2 : Int){
    println(num1 + num2)
}

fun sumThree(num1 : Int, num2 : Int, num3 : Int){
    println(num1 + num2 + num3)
}

fun minus(num1 : Int, num2 : Int){
    if(num1 >= num2){
        println(num1 - num2)
    }else{
        println(num2 - num1)
    }
}

fun division(num1 : Int, num2 : Int){
    println(num1/num2)
}

//나머지는 %를 사용
fun remainder(num1 : Int, num2 : Int){
    println(num1%num2)
}