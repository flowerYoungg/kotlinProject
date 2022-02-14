package section3
// 여러개의 동전 중
// 가장 동전의 수를 적게 받을 수 있는 solution 을 만드세요

// 1360 -> 500 x 2 / 100 x 3 / 50 x 1 / 10 x 1 = 7
// 1510 -> 500 x 3 / 10 x 1 = 4

fun main(){

    val coins1 = arrayListOf<Int>(500, 100, 50, 10)
    val money1 = 1360
    val result1 = solution11(coins1, money1)
    println(result1)
    // 7

    val coins2 = arrayListOf<Int>(500, 100, 50, 10)
    val money2 = 1510
    val result2 = solution11(coins2, money2)
    println(result2)
    // 4
}


fun solution11(coins: ArrayList<Int>, money: Int) : Int{

    // 1360 -> 500 x 2 -> 360
    // 360 -> 100 x 3 -> 60
    // 60 -> 50 x 1 -> 10
    // 10 -> 10 x 1 -> 끝

    var resultCount = 0
    var currentMoney = money

    for(coin in coins) {
        //coin으로 나눈 몫
        resultCount = resultCount + currentMoney / coin
        //나머지
        currentMoney = currentMoney % coin
    }

    return resultCount
}