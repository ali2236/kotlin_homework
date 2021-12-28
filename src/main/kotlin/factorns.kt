fun main() {
    println("Enter n: ")
    val n = readLine()!!.toLong()
    var total = 0L
    var fact = 1L
    for (i in 1..n) {
        fact *= i
        total += fact
    }
    println("n sum factorial of $n is $total")
}


