package section1

//상속(inheritance) 과 오버라이딩(overriding)
//상속 : 자식 클래스가 부모 클래스의 멤버를 물려받음
//오버라이딩 : 부모클래스의 메소드를 자식클래스에서 재정의해서 사용


fun main() {
    Child().doing()
    Child().disease()
}

open class Parents(){
    fun doing(){
        println("돌봄")
    }

    open fun disease(){
        println("당뇨")
   }
}

class Child() : Parents(){
    override fun disease() {
        super.disease()
        //재정의 가능
        println("겁쟁이")
    }
}