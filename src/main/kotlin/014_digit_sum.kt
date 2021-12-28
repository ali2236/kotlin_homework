fun main(){
    print("Enter n: ")
    val n = readLine()!!.toInt()
    var m = n
    var sum = 0
    var count = 0
    while (m > 0){
        val d = m % 10
        sum += d
        count++
        m /= 10
    }
    println("$n(sum=$sum, count=$count)")
}