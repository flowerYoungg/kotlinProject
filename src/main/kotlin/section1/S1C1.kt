package section1

//엘비스 연산자(Elvis Operator)
//null 처리를 위한 연산자
//null 이란 아무것도 없는것

fun main() {
    var testStr1  = null
    println(testStr1)

    var testStr2 : String? = null
    println(testStr2)

    println(findStringLength1("abc"))
    println(findStringLength2(null))
    println(findStringLength3("abcde"))
    println(findStringLength4(null))
}

fun findStringLength1(str : String) : Int {
    return str.length
}

fun findStringLength2(str : String?) : Int? {
    return str?.length
}

fun findStringLength3(str : String?) : Int {
    var resultCount = 0
    if (str != null){
        resultCount = str.length
    }
    return resultCount
}

//엘비스 연산자!!!
fun findStringLength4(str : String?) : Int {
    //str.length가 만약 null일 경우에 0을 리턴하고, null이 아닐 경우에는 str.length을 리턴
    return str?.length ?: 0
}