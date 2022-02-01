package section1

//상속
//물려받는다

fun main() {
    Job3()
    Job4()
}

//상속자는 open을 붙여야함
open class AllJobs(){
    init{
        println("일하는 중")
    }
}

class Job1() {
    init {
        println("일하는 중")
        println("코딩하는 중")
    }
}

class Job2() {
    init {
        println("일하는 중")
        println("공부하는 중")
    }
}

//AllJobs를 상속하겠다 -> : AllJobs
class Job3() : AllJobs(){
    init {
        println("운동하는 중")
    }
}

class Job4() : AllJobs(){
    init {
        println("상속 테스트 중")
    }
}