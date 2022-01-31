package section1

//Any : 모든 아이들을 포함하는 조상같은 역할
//is : 조건이 맞나 확인하는 역할
//as : type casting, 타입 변경을 체크하는 역할
fun main() {

    //Any : 문자열이든 숫자든 어떤 타입으로든 대응가능
    var str1 : Any = "abc"
    println(str1)
    str1 = 123
    println(str1)

    //is
    var str2 : Any = "abc"
    if(str2 is String){
        println("this is String")
    }else{
        println("this is not String")
    }

    var str3 : Any = 1234L
    when(str3){
        is Int -> {println("this is Int")}
        is String -> {println("this is String")}
        else -> {
            println("this is else type")
        }
    }

    //as : type casting이 되지 않을 경우 null을 반환한다
    var str4 : String? = 1 as? String
    println(str4)

}