import kotlin.random.Random

fun main() {
    print("Enter N: ")
    val n = readLine()!!.toInt()

    val mat = Array(n) { IntArray(n) { Random.nextInt(10) } }

    var sum = 0
    for (i in 0 until n) {
        sum += mat[i][i]
        sum += mat[i][n-i-1]
    }

    mat.forEach {
        println(it.joinToString(" "))
    }

    println(sum)
}