package section2

//Object -> 싱글톤패턴
//객체를 하나만 생성
//



fun main() {
    val test1 = TestClass()
    val test2 = TestClass()
    test1.count = 10
    println(test1.count)
    println(test2.count)

    //객체를 하나만 생성
    //전역으로 사용 가능
    val test3 = testObject
    val test4 = testObject
    test3.count = 10
    println(test3.count)
    println(test4.count)

    //class내부의 companion object
    val test5 = TestObjectClass()
    val test6 = TestObjectClass()
    test5.plusBtn()
    println(TestObjectClass.number)
    test6.minusBtn()
    println(TestObjectClass.number)
}


class TestClass {
    init {
        println("testClass")
    }
    var count = 0
}

object testObject {
    init {
        println("testObject")
    }
    var count = 0
}

class TestObjectClass {
    companion object {
        var number = 0
    }
    fun plusBtn(){
        number ++
    }
    fun minusBtn(){
        number --
    }
}