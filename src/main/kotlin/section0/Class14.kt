//문자열 가공
//유자가 입력한 데이터를 가공
//서버에서 가져온 데이터를 알맞게 가공

fun main() {
    //split
    val testString = "동해물과 백두산이 마르고 닳도록"
    val newTestString1 = testString.split(" ")
    println(newTestString1)

    //substring(a,b): a 부터 b의 전까지
    val newTestString2 = testString.substring(1,3)
    println(newTestString2)

    //replace
    val replaceValue = testString.replace("백두산", "한라산")
    println(replaceValue)

    val testList = ArrayList<String>()
    testList.add("abc1@naver.com")
    testList.add("abc2@google.com")
    testList.add("abc3@daum.com")
    testList.add("abc4@kakao.com")
    testList.add("abc5@naver.com")
    testList.add("abc6@kakao.com")
    testList.add("abc7@naver.com")

    // 저는 저기 이메일이 @다음에 naver라고 적힌 이메일의 갯수를 찾고 싶어요!
    // 첫번째 방법으로는 naver라는 텍스트가 포함되었는지 찾기
    // 첫번쨰 방법의 문제는 -> naver@google.com
    // 두번째 방법으로는 @뒤에 naver라고 텍스트가 있고 그 다음에 .이 이어진 이메일이 몇개인지 찾기
    // ******@naver.
    var count = 0
    for(i in testList){
        if(i.split("@")[1].split(".")[0] == "naver"){
            count++
        }
    }
    println(count)




}

