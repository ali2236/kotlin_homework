fun main(){
    print("Enter n: ")
    val n = readLine()!!.toInt()
    val palindrome = n.toString() == n.toString().reversed()
    println(palindrome)
}

fun main0(){
    print("Enter n: ")
    val n = readLine()!!.toInt()
    var m = n
    var r = 0
    while (m > 0){
        val a = m % 10
        r = r * 10 + a
        m /= 10
    }
    println(n == r)
}