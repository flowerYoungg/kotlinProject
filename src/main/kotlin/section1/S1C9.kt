package section1

//Interface 인터페이스
//추상클래스와 비슷
//꼭 채워넣어야 하는 틀이지만 작은 틀이라 다른 틀에 여러가지를 넣을 수 있음

fun main() {
    Ventz().autoDriving()
    Ventz().autoParking()
}

abstract class CarTest(){
    abstract fun wheel()
    abstract fun engine()
}


interface CarAutoDriving {
    fun autoDriving()
}

interface CarAutoParking {
    fun autoParking()
}

class Ventz() : CarTest(), CarAutoDriving, CarAutoParking{
    override fun wheel() {
        println("Ventz 바퀴")
    }
    override fun engine() {
        println("Ventz 엔진")
    }
    override fun autoDriving() {
        println("Ventz 자율주행")
    }

    override fun autoParking() {
        println("Ventz 자율파킹")
    }

}

class BMW() : CarTest(){
    override fun wheel() {
        println("BMW 바퀴")
    }
    override fun engine() {
        println("BMW 엔진")
    }
    fun autParkingO() {
        println("BMW 자율주차")
    }
}