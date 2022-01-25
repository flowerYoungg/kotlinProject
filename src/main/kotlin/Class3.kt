// 자료형 -> 숫자(int, Long, double, Float) 문자(String) boolean(true, false)
// 형 변환
// null type
fun main(args: Array<String>) {
    val test1 = "1234"
    val test2 = 1234

    println(test1::class.java.simpleName)
    println(test2::class.java.simpleName)

    val test3 = 1234.1234
    println(test3::class.java.simpleName)

    val test4 : Int = 1234
    println(test4)

    val test5 : Float = 1234.1234f
    println(test5)

    //Int -> String
    val test6 : Int = 123
    val test7 = test6.toString()
    println(test7::class.java.simpleName)

    //String -> Int
    val test8 : String = "123"
    val test9 = Integer.parseInt(test8)
    println(test9::class.java.simpleName)

    //null
    val test10 = null
    val test11 = ""

    println(test10)
    println(test11)

    //String? : String일 수도, null일 수도 있다
    val test12 : String? = null
    println(test12)
}