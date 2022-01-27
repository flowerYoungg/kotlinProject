//List
//Map
//Set

fun main() {
    //mutableListOf(넣고 빼기가 가능한 리스트)
    val testList1 = mutableListOf<String>("a", "b","c")
    testList1.add("d")
    println(testList1)

    testList1.remove("a")
    println(testList1)


    //Map mutableMapOf
    //5:유리 10:철수 15:짱구 20:훈이
    val testMap1 = mutableMapOf<Int, String>()
    testMap1.put(5,"유리")
    testMap1.put(10,"철수")
    testMap1.put(15,"짱구")
    testMap1.put(20,"훈이")
    println(testMap1[15])

    testMap1[100] = "하용"
    println(testMap1)

    //Set : 중복이 허용되지 않음 mutableSetOf
    val testSet1 = mutableSetOf<String>("a", "b","c")
    println(testSet1)
    testSet1.add("b")
    println(testSet1)

}