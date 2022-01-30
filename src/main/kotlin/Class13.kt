//논리연산
//and or


fun main() {
    val a = "남자"
    val b = 19

    //And
    if(a == "남자" && b >= 20){
        println("And 조건 만족")
    }else{
        println("And 조건 불만족")
    }

    val c = "여자"
    val d = 29
    //Or
    if(c == "여자" || d >= 30){
        println("Or 조건 만족")
    }else{
        println("Or 조건 불만족")
    }

    val student = mutableMapOf<Int, String>()
    student[99] = "민지"
    student[20] = "철수"
    student[35] = "민수"
    student[48] = "가영"
    student[100] = "하영"
    student[22] = "수진"
    student[45] = "수달"
    student[88] = "캥거루"
    student[91] = "코알라"
    student[87] = "악어"
    student[54] = "코끼리"
    student[42] = "하마"

    //학생들 중 점수가 50점 이상이고 And 학생이름 길이가 3이상인 친구들을 출력
    for(i in student){
        if(i.key >= 50 && i.value.length >= 3){
            println(i.value)
        }
    }
}