package section1

//class : 설계 + 기능

fun main() {
    println(Test().a)
    println(Test2("abcd").b)
    Test3().test3Fun()

    val myinfo = MyInfo()
    println(myinfo.getMyAge())
    println(myinfo.getMyName())
    println(myinfo.getMyLocation())

    val dog = Dog("뽀또", 1)
    println( dog.getMyDogInfo())

    InitTest().testInitFun()
    InitialValue("김다미") // 파라미터에 값을 입력하지 않으면 초기값으로 출력됨 20
    InitialValue("최우식", 30) // 파라미터에 값을 입력하면 초기값으로 출력되지 않음
}

class Test{
    val a = "abc"
}

class Test2(str : String){
    val b = str
}

class Test3(){
    fun test3Fun(){
        println("test3Fun 출력")
    }
}

class MyInfo() {
    fun getMyAge() : Int {
        return 29;
    }
    fun getMyName() : String {
        return "Liv"
    }
    fun getMyLocation() : String {
        return "Tokyo"
    }
 }

class Dog(name : String, age : Int) {
    val dogName = name
    val dogAge = age

    fun getMyDogInfo() : String {
        return "$dogName : $dogAge 살";
    }
}

class InitTest() {
    init{
        println("초기화처리")
    }
    fun testInitFun(){
        println("testInitFun")
    }
}

class InitialValue(name : String, age : Int = 20){
    init {
        println(name)
        println(age)
    }
}