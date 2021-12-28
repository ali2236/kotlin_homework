import kotlin.random.Random

fun main(){
    print("Array length: ")
    val n = readLine()!!.toInt()
    if (n < 1) {
        System.err.println("Invalid length $n")
        return
    }

    val a = Array(n) {
        Random.Default.nextInt(0, 100)
    }

    println(a.joinToString(" "))

    var sum = 0
    for (i in 0 until a.size){
        sum += a[i]
    }

    val avg = sum / a.size.toDouble()
    println("Average: $avg")
}