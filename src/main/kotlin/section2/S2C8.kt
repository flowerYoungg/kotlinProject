package section2

//scope function

//run -> 객체 초기화와 return 값 계산이 필요할 때 주로 사용
//apply -> 값을 반환하지 않고 객체 구성에 대해 주로 사용
//also -> 객체에 대해 추가적인 작업을 할 때 주로 사용

fun main() {
    //run
    val service = multiPortService("www.naver.com", 80)
    val result1 = service.query(service.prepareRequest() + " to port ${service.port}")
    println(result1)

    val result2 = service.run {
        port = 8080
        query(prepareRequest() + " to port ${service.port}")
    }
    println(result2)

    //apply
    val tester1 = Person(":Tester1")
    println(tester1)

    tester1.age = 20
    tester1.city = "Busan"
    println(tester1)

    val tester2 = Person("Tester2").apply {
        age = 30
        city = "Tokyo"
    }
    println(tester2)


    //also
    val numbers = mutableListOf<Int>(1,2,3,4)
    println("$numbers 여기에서 5를 추가합니다")
    numbers.add(5)
    println(numbers)

    val numbers2 = mutableListOf<Int>(1,2,3,4)
    numbers2.also {
        println("$numbers2 여기에서 5를 추가합니다")
    }.add(5)
    println(numbers2)
}

//run
class multiPortService (var url : String, var port : Int){
    fun prepareRequest() : String = "기본 요청 URL : $url"
    fun query(request : String) = "결과 query $request"
}

//apply
data class Person(
    var name :String,
    var age : Int = 0,
    var city : String = ""
)

