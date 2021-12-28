import kotlin.math.sqrt
import java.util.*

fun main(args: Array<String>) {
    val n: Int = readLine()!!.toInt()
    solve(n)
}

private fun solve(max: Int) {
    val primes = BooleanArray(max + 1)
    Arrays.fill(primes, true)
    var p = 2
    while (p * p <= max) {
        if (primes[p]) {
            var i = p * p
            while (i <= max) {
                primes[i] = false
                i += p
            }
        }
        p++
    }
    val out = StringBuilder()
    for (i in 2 until primes.size) {
        if (primes[i]) {
            out.append(i).append(" ")
        }
    }
    println(out)
}



fun main00(){
    print("Enter k: ")
    val k = readLine()!!.toInt()
    for (n in 2..k) {
        var prime = true
        for (i in 2..sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                prime = false
                break
            }
        }
        if(prime) print("$n ")
    }
}
