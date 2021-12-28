import java.util.*

fun main(){
    print("Enter N: ")
    val n = readLine()!!.toInt()
    val scanner = Scanner(System.`in`)
    val a = IntArray(n){ scanner.nextInt() }

    for(i in 1 until n){
        var j = i
        while (j>0 && a[j] < a[j-1]){
            a[j] = a[j-1].also { a[j-1] = a[j] }
            j--
        }
    }

    a.also { println(it.joinToString(" ")) }
}