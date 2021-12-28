import java.util.*

fun main(){
    print("Enter N: ")
    val n = readLine()!!.toInt()
    val scanner = Scanner(System.`in`)

    val mat = Array(n) { IntArray(n) { scanner.nextInt() } }

    // print matrix
    println()
    mat.forEach { println(it.joinToString(" ")) }

    for (i in 0 until n){
        mat[i][i] = mat[i][n-i-1].also { mat[i][n-i-1] = mat[i][i] }
    }

    // print transpose
    println()
    mat.forEach { println(it.joinToString(" ")) }
}
