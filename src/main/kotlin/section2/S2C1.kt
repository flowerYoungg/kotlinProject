package section2

//Lambda 람다 : 선언되지 않았지만 즉시 표현식으로 전달되는 함수

fun main() {
    println(a())
    println(b())
    println(sum(1,2))

    println(sumNumber(1,2))
    println(sumTypeNumber(1,2))
    println(sumTypeNumberNull(1,2))

    println(sumString("1", "2"))
    println(sumStringType("1", "2"))
}

//람다식
val sumNumber = { a : Int, b : Int -> a+b}
val sumTypeNumber : (Int, Int) -> Int = {a,b -> a + b}
val sumTypeNumberNull : (Int, Int) ->  Int? = {a, b -> null}

val sumString = {a : String, b : String -> "String1 : $a ,String2 : $b"}
val sumStringType : (String, String) -> String = {a, b -> "String1 : $a ,String2 : $b"}



fun sum(a : Int, b : Int) : Int {
    return a+b
}

fun a() : String {
    return "A text"
}

fun b() = "B text"