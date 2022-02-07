package section2

//scope function : 범위 기능

//let-> not null일 때 동작하고 null일 때 동작하지 않게 하기 위해 사용
//with-> 컨텍스트 내부에서 함수를 호출할 때 사용


fun main() {
    //let
    val str : String? = "hello"
    println(str?.length)

    val length = str?.let {
        println(it)//it = str
        it.length
    }
    println(length)


    val str2 : String? = null
    val length2 = str2?.let {
        println(it)
        it.length
    }
    //null이므로 실행되지 않음
    println(length2)


    //with
    val numbers = mutableListOf<String>("a","b","c","d")
    println(numbers.first())
    println(numbers.last())

    val firstAndLast = with(numbers){
        "${first()}와${last()}"
    }
    println(firstAndLast)

}
