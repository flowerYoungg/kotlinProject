package section1

//중첩 Class : Nested Class -> 객체지향 / 캡슐화, 외부에 있는 변수에 접근이 불가능하다
//내부 Class : Inner Class -> RecyclerView, 외부에 있는 변수에 접근이 가능하다

fun main() {
    val test1 = Test1.Test1NestedClass()
    test1.testFun1()

    val test2 = TesT2().Test2InnerClass()
    test2.testFun2()
}

class Test1 {
    class Test1NestedClass {
        fun testFun1(){
            println("TestFun1")
        }
    }
}

class TesT2 {
    val tempText2 = "tempText2"

    inner class Test2InnerClass {
        fun testFun2(){
            println("TestFun2")
            println(tempText2)
        }
    }
}

