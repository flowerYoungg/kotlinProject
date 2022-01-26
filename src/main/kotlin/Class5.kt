
// 간단한 조건문을 이용한 문제풀이
// 학생의 a b c d f 점수를 출력


fun main(args: Array<String>) {
    val score = 80

    //학생 점수
    // 100점 초과일 경우 A
    // 90점 초과일 경우 B
    // 80점 초과일 경우 C
    // 70점 초과일 경우 D
    // 70점 이하일 경우 F
    if(score > 100){
        println("A")
    }else if(score > 90){
        println("B")
    }else if(score > 80){
        println("C")
    }else if(score > 70){
        println("D")
    }else {
        println("F")
    }
}