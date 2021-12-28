import kotlin.random.Random

fun main(){
    print("Enter N: ")
    val n = readLine()!!.toInt()

    val mat = Array(n) { IntArray(n) { Random.nextInt(10) } }

    // print matrix
    mat.forEach { println(it.joinToString(" ")) }

    for (i in 0 until n){
        for (j in 0 until i){
            mat[j][i] = mat[i][j].also { mat[i][j] = mat[j][i] }
        }
    }

    // print transpose
    println()
    mat.forEach { println(it.joinToString(" ")) }
}

