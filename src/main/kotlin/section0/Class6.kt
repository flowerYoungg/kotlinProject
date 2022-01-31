// 리스트와 filter
// 물음표와 느낌표
// 반복문

fun main() {
    // 리스트
    val testList1 = ArrayList<String>()
    testList1.add("a")
    testList1.add("b")
    testList1.add("c")

    println(testList1)
    println(testList1[0])
    println(testList1[1])
    println(testList1[2])

    val testList2 = listOf("d","e","f")
    println(testList2)

    val testList3 = mutableListOf<String>("g","h","i")
    testList3.add("j")
    println(testList3)

    //filter
    val testList4 = listOf<String>("student1","student2","student3","student4","teacher1","teacher2")
    println(testList4.filter { it.startsWith("s") })

    val testList5 = listOf("student1","student2","student3","student4","teacher1","teacher2", null)
    println(testList5.filterNotNull().filter { it.startsWith("t") })

    // 물음표와 느낌표
    var test1 : String = "a"
    var test2 : String? = "b"   //String일 수도 있고 null일 수도 있는 값
    test1 = test2!! //null일 수 있는 가능성이 있기 때문에 삽입불가능 에러가 뜨지만 느낌표 두개를 붙이면 에러해소
    println(test1)

    // 반복문
    val testList6 = listOf("a","b","c","d","e","f")
    for (i in testList6){
        println(i)
    }

    for (i in 1..10 step 2){
        println("i의 값은 : $i")
    }
}