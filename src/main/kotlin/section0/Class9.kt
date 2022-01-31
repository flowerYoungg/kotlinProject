//while
//Iterator

fun main() {

    //While
    var count = 0
    while(count < 100){
        // count = count + 1
        count ++
        println(count)
    }

    //Iterator
    val testList1 =  mutableListOf<String>("a", "b", "c")
    val testIterator = testList1.listIterator()
    println(testIterator.next())
    println(testIterator.next())
    println(testIterator.next())
    println(testIterator.hasNext())
    println(testIterator.previous())

    while(testIterator.hasNext()){
        println(testIterator.next())
    }
    
}