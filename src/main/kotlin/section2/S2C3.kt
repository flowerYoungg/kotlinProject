package section2

//제네릭 (generic)
//컴파일 시에 타입 체크를 할 수 있다
//타입캐스팅이 필요없다



fun main() {
    val box1 = Box1(10)
    println(box1.value)

    val box2 = Box2("스트링 10")
    println(box2.value)

    //제너릭 -> 타입 상관없음
    val box3 = Box3(10)
    println(box3.value)

    val box4 = Box3("10")
    println(box4.value)

    testFun1("a")
    testFun1(1)

}

class Box1(test : Int) {
    var value = test
}

class Box2(test : String) {
    var value = test
}

//제너릭
class Box3<T>(test : T) {
    var value = test
}

fun <T> testFun1(a : T){
    println(a)
}