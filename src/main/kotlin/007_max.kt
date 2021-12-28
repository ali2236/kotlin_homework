fun main(args: Array<String>) {

    val max = readLine()!!
        .split(' ')
        .map { it.toInt() }
        .maxOrNull()

    println(max)
}