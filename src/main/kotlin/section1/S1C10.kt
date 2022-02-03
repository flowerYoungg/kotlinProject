package section1

//Data Class
//데이터를 넣어 놓는 클래스
//서버에서 데이터를 받아온 것을 넣어 놓을 때 주로 사용

fun main() {
    var dataDog = DataDog("뽀또", 1)
    println(dataDog.name)
    println(dataDog.age)
    println(dataDog.toString()) //그냥 class의 경우에는 원하는 결과값이 나오지 않음

    val dataDog2 = dataDog.copy("뽀또 여자친구")
    println(dataDog2.toString())
}


data class DataDog(var name : String, var age : Int)


