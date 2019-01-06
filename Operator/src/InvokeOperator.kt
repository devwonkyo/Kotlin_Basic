class InvokePrint(val id:Int,val name:String){
    operator fun invoke(value:String){
        println(value)
        println("ID = ${id}, NAME = ${name} ")
    }
}

fun main(args:Array<String>){
    val printInfo = InvokePrint(201331036,"정원교")

    printInfo("학생 정보를 출력합니다.")
}