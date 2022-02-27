fun main(){
val nums = listOf(11,6,9,1,7)
    val len = nums.count()
    println("There are $len elements")
    val max = nums.maxOrNull()
    println("The maximum of the list is $max")
    val min = nums.minOrNull()
    println("The minimum of the list is $min")
    val sum = nums.sum()
    println("The sum of the list is $sum")
    val avg = nums.average()
    println("The average of the list is $avg")
    fruit()



}
fun fruit(){
    val fruit = "orange"
    println(fruit[0])
    println(fruit[1])
    println(fruit[2])
    println(fruit[3])
    println(fruit[4])
    println(fruit[5])
}









