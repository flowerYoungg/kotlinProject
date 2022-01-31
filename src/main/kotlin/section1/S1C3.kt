package section1

//List 가공하기

fun main() {
    val testList1 = mutableListOf<Int>()
    testList1.add(1)
    testList1.add(2)
    testList1.add(3)
    testList1.add(4)
    testList1.add(10)
    testList1.add(10)
    testList1.add(11)
    testList1.add(11)

    //중복제거
    println(testList1.distinct())

    //최대값
    println(testList1.maxOrNull())
    //최소값
    println(testList1.minOrNull())

    //평균값
    println(testList1.average())

    val testList2 = listOf<String>("Liv", "Becky", "Lucy", "Linda")

    //접두어 필터링
    val result1 = testList2.filter {
        it.startsWith("L")
    }
    println(result1)

    val testList3 = listOf<Int>(1,2,3,4,5)

    //짝수
    val result2 = testList3.filter {
        it % 2 == 0
    }
    println(result2)

    //해당되는 조건을 그룹화
    val testList4 = listOf<String>("a","aa","aaa")
    val result3 = testList4.groupBy {
        it.length>=2
    }
    println(result3)
    println(result3[true])
}