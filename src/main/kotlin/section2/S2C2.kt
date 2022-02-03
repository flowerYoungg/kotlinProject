package section2

//고차함수 Higher order Function
//f(x) = x -> f(f(x)) = x


fun main() {
    println(testLambaSum(1,2))
    sum(2,2, {a : Int, b: Int ->  a+b})
    sum(2,2) {a : Int, b: Int ->  a+b}
    sum(1,2, ::testSum)

    printTest("String Test")
    highPrintTest(::printTest)
}

fun testSum(a: Int, b: Int) : Int {
    return a+b
}
val testLambaSum = {a : Int, b : Int -> a + b}

fun sum(a : Int, b: Int, operation : (Int, Int) -> Int) {
    println("$a , $b")
    println(operation(a,b))
}

fun printTest(str : String){
    println(str)
}

//Unit : 아무것도 반환하지 않는다
fun highPrintTest(operation: (String) -> Unit){
    operation("Operation Test")
}