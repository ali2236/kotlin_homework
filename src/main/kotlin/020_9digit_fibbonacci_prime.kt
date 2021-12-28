import kotlin.math.sqrt

fun main(){

    val fib = mutableListOf(0L, 1L)
    var i = 0
    while (fib[fib.size - 1] < 1e9){
        if(fib.size < i+1) fib.add(i, fib[i-1] + fib[i-2])
        i++
    }

    var last = 0L
    for (i in fib.size downTo 1){
        val num = fib[i-1]
        var prime = true
        for (j in 2..sqrt(num.toDouble()).toInt()){
            if(num%j==0L){
                prime = false
                break
            }
        }
        if (prime){
            last = num
            break
        }
    }
    print(last)
}