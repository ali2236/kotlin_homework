import kotlin.math.sqrt

fun main(){
    println("Enter 3 numbers: ")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val delta = b * b - 4 * a * c
    if(delta > 0){
        val x1 = (-b + sqrt(delta.toDouble())) / (2 * a)
        val x2 = (-b - sqrt(delta.toDouble())) / (2 * a)
        println("x1=$x1")
        println("x2=$x2")
    } else if (delta == 0){
        val x1 = -b / (2 * a)
        println("x1=$x1")
    } else {
        println("Rishe Nadarad")
    }
}