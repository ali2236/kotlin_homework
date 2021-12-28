

fun main() {
    println("Enter n: ")
    val n = readLine()!!.toLong()
    var fact = 1L
    for (i in 1..n) {
        fact *= i
    }
    println("factorial of $n is $fact")
}
















fun main2() {
    readLine()
        ?.toLong()
        ?.let { (1..it).reduce { acc, l -> acc * l } }
        .let { print(it) }
}