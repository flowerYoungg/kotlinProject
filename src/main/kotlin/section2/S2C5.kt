package section2

//지연초기화
//lateinit : 서버에서 받아온 데이터를 미리 변수를 선언해놓고 추후에 값을 넣는다
//lazy


fun main() {
    var justString : String = "스트링"
    println(justString)

    justString = "변경된 스트링"
    println(justString)

    //값을 바로 넣어주지 않아도 에러가 발생하지 않음
    lateinit var lateString : String
    lateString = "느린스트링"
    println(lateString)

    //사용할 때만 값이 출력됨(lazyString이 불려질 때만)
    val lazyString : String by lazy {
        "lazyTestString"
    }
    println(lazyString)
}

