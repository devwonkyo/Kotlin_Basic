fun main(args:Array<String>){
    getSumOf(1,2,3,4,5,6,7)
    varialbeArgu(1,2,3,4,5,6,something = "variationTest")
}

fun varialbeArgu(vararg nums:Int,something:String){
    var count = nums.size
    println("Int Type variation = $count, String Type VALUE = $something")
}

fun getSumOf(vararg numbers:Int){
    var count = numbers.size
    var i = 0; var sum = 0

    for (i in 0 until count-1){
        sum += numbers[i]
    }
    println("instance sum = $sum")
}

