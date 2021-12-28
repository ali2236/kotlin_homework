// Ali Ghanbari

fun main() {
    print("Enter n: ")
    val base10 = readLine()!!.toInt()
    val base2 = base10.toString(2)

    println("($base10)10 = ($base2)2")
}

fun main1() {
    print("Enter n: ")
    val base10 = readLine()!!.toInt()
    var n = base10
    val builder = StringBuffer()
    do {
        builder.insert(0, n % 2)
        n /= 2
    } while (n != 0)
    println("($base10)10 = (${builder})2")
}