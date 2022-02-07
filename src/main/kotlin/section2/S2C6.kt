package section2

//infix function : 중간삽입 기능

fun main() {
    println(sumN(1,2))
    println(10 sum1 20)
    println(30 minus1 20)
    println(2 multi1 3)

    println("스트링" stringTest "테스트")

    println(10 showList 20)
}

fun sumN (a : Int , b : Int) : Int {
    return a + b
}

infix fun Int.sum1(num : Int) : Int = this + num
infix fun Int.minus1(num : Int) : Int = this - num
infix fun Int.multi1(num : Int) : Int = this * num

infix fun String.stringTest(str : String) : String = this + str

infix fun Int.showList(num : Int) : List<Int> {
    val list = mutableListOf<Int>()
    //this : 10 , num : 20
    for(i in this..num){
        list.add(i)
    }
    return list
}