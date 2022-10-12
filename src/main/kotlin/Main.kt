fun main(args: Array<String>) {
    println("Hello World!")


    fun max(a:Int,b:Int):Int{
        // max 함수이름 = 함수명
        // (a:Int, b:Int) == 파라미터 , a = 파라미터명 , Int = > 파라미터 타입
        //  :Int => 반환타입 fun 함수 사용 하면 매개변수를 받고 값을 반환해줘여함.

        return if (a > b) a else b
    }

    println(max(1,2))


    fun max1(a:Int,b:Int):Int = if(a>b) a else b


    // 아래에 기존방식보다 훨씬 편리하다.

  /*  fun max(a:Int,b:Int):Int{
        // max 함수이름 = 함수명
        // (a:Int, b:Int) == 파라미터 , a = 파라미터명 , Int = > 파라미터 타입
        //  :Int => 반환타입 fun 함수 사용 하면 매개변수를 받고 값을 반환해줘여함.

        return if (a > b) a else b
    }*/

    println(max1(1,2))




}