fun main() {
    print("Enter n: ")
    val n = readLine()!!.toInt()

    println(fibonacci(n))
}

fun fibonacci(n: Int): Long {
    val fib = mutableListOf(0L, 1L)
    for (i in 0..n) {
        if (fib.size < i + 1) fib.add(i, fib[i - 1] + fib[i - 2])
    }
    return fib[n]
}