import java.util.*

// saddle point:
// - min in row
// - max in col
fun main(){
    print("Enter N: ")
    val n = readLine()!!.toInt()
    val scanner = Scanner(System.`in`)

    val mat = Array(n) { IntArray(n) { scanner.nextInt() } }

     outer@ for (i in 0 until n){
        // min in row(i)
            var min = 0
        for (j in 1 until n) if(mat[i][j] < mat[i][min]) min = j

        // if min is max in its col
        for (j in 0 until n) if(mat[i][min] < mat[j][min]) continue@outer

         println("Saddle Point is = ${mat[i][min]}")
         return
    }

    println("No Saddle Point")
}
