import java.util.*

fun main() {
    print("Enter n: ")
    val n = readLine()!!.toLong()
    val scanner = Scanner(System.`in`)
    var positive = 0
    var negative = 0
    var even = 0
    var odd = 0
    for (i in 1..n) {
        val j = scanner.nextInt()
        if (j>0) positive++ else if(j<0) negative++
        if (j%2==0) even++ else odd++
    }
    println("positve=$positive, negative=$negative, even=$even, odd=$odd")
}


