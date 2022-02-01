package section1

//오버로딩 -> OverLoading
// over + loading : 겹겹히 쌓는다
// 같은 이름의 메소드를 여러개 가지면서, 매개변수의 유형과 개수가 다르도록 하는 것

fun main() {
    val result = Calculator()
    result.sumNumber(1,2)
    result.sumNumber(1,2,3)
    result.sumNumber("이건","테스트")


}

class Calculator () {
    fun sumNumber(a : Int , b : Int){
        println(a+b)
    }

    fun sumNumber(a : Int , b : Int, c: Int){
        println(a+b+c)
    }

    fun sumNumber(a : String , b : String){
        println(a+b)
    }
}