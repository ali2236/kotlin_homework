fun main(){
    print("Enter n: ")
    val n = readLine()!!.toInt()
    var sum = 0.0
    var fact = 1
    for (i in 1..n){
        fact *= i
        sum += i / fact.toDouble()
    }
    println(sum)
}