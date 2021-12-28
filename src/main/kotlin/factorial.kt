import java.math.BigInteger

fun main(){
    print("Enter n: ")
    val n = readLine()!!.toLong()

    println(factorialRecursive(n))
    println(factorial(n))
}

fun factorialRecursive(n: Long): BigInteger{
    if(n<=1) return BigInteger.ONE
    return BigInteger.valueOf(n).multiply(factorialRecursive(n-1))
}

fun factorial(n: Long): BigInteger{
    var r = BigInteger.ONE
    for (i in 1L..n){
        r = r.multiply(BigInteger.valueOf(i))
    }
    return r
}