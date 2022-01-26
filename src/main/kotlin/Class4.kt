// 조건문
// if else
// when
fun main(args: Array<String>) {
    val score1 = 100
    if(score1 > 150){
        println("150이상")
    }else{
        println("150미만")
    }

    val score2 = 50
    if(score2 > 50){
        println("50초과")
    }
    if(score2 >= 50){
        println("50이상")
    }

    val score3 = 20
    if(score3 > 100){
        println("100 초과")
    }else if(score3 > 50){
        println("50 초과")
    }else if(score3 > 30){
        println("30 초과")
    }else {
        println("30 미만")
    }

    // when
    val score = 70
    when(score){
        100 -> {
            println("100")
        }
        90 -> {
            println("90")
        }
        80 -> {
            println("80")
        }
        else -> {
            println("Nope")
        }
    }
}