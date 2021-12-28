import kotlin.random.Random

fun main() {
    print("Array length: ")
    val n = readLine()!!.toInt()

    val a = Array(n) {
        Random.Default.nextInt(0, 100)
    }

    println(a.joinToString(" "))
}