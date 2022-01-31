//변수: 값을 담아놓는 박스
// val: 박스 안에 값을 넣고 테이프로 밀봉 -> 값 변경이 불가능
// var: 박스 안에 값을 넣고 테이프로 밀봉하지 않음 ->  값 변경 가능

fun main(args: Array<String>) {
    println("Hello Kotlin World!")

    val asdf = "test"
    println(asdf)

    var changable = "value"
    changable = "new value"
    println(changable)
}