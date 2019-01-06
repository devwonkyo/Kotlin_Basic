class Person(var name:String,var department:String){
    operator fun get(position:Int):String{
        return when(position){
            0 -> name
            1 -> department
            else -> "nothing"
        }
    }

    operator fun set(position: Int,value:String){
        when(position){
            0 -> name = value
            1 -> department = value
        }
    }
}

fun main(args:Array<String>){
    val person = Person("정원교","컴퓨터공학과")
    println("이름 = ${person.name}, 학과 = ${person.department}")
    println("index를 이용한 이름 불러오기 = ${person[0]}")
    println("index를 이용한 학과 불러오기 = ${person[1]}")
    println("index설정 되어있지 않았을 때 = ${person[3]}")

    person[0] = "홍길동"
    person[1] = "사회복지학과"  //operator set 설정

    println("set index를 이용한 바뀐 이름 = ${person[0]}, 학과 = ${person[1]}")

}