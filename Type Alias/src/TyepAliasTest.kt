typealias Number = Int

fun testType(num:Number):Number{
    val number = num
    println("number value = $number")
    print("And return Type Int = ")
    return number
}

fun main(args:Array<String>){
    print(testType(100))
}