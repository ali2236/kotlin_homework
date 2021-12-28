import kotlin.math.sqrt

fun main() {
    print("Enter n: ")
    val n = readLine()!!.toInt()

    println(isPrime(n))
}

fun isPrime(n: Int): Boolean {
    var prime = n > 1
    for (i in 2..sqrt(n.toDouble()).toInt()){
        if(n%i==0){
            prime = false
            break
        }
    }
    return prime
}