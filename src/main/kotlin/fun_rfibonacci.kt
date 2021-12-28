fun main() {
    print("Enter n: ")
    val n = readLine()!!.toInt()

    println(recursiveFibonacci(n))
}

private val cache = mutableMapOf<Int, Long>()
fun recursiveFibonacci(n: Int): Long {
    return cache.computeIfAbsent(n)
    { if (n <= 1) n.toLong() else recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2) }
}