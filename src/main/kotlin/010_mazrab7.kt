fun main() {
    println("Enter n: ")
    val n = readLine()!!.toLong()
    for (i in 0 until n step 7) {
        print("$i ")
    }
}


