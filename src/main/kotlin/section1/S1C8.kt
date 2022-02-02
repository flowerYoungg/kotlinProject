package section1

//추상클래스(abstract class)
//class : 붕어빵 틀
//abstract class : 기존에는 비어있지만 꽉 채워서 붕어빵을 만들어야 하는 틀
//공통적 기능을 구현해줘야 할 때 이용

fun main() {
    Audi().wheel()
    Audi().engine()
}

abstract class Car(){
    abstract fun wheel()
    abstract fun engine()
}

class Audi() : Car() {
    override fun wheel() {
        println("아우디 바퀴")
    }
    override fun engine() {
        println("아우디 엔진")
    }
}

/**
open class Car(){
    open fun wheel(){
        println("굴러감")
    }
    open fun engine(){
        println("시동")
    }
}

class Bike() : Car(){
    override fun wheel() {
        println("자전거 운전")
   }
}
*/