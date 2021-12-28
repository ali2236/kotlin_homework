import kotlin.math.sqrt

fun main(){
    print("Enter n: ")
    val n = readLine()!!.toInt()
    var prime = n > 1
    for (i in 2..sqrt(n.toDouble()).toInt()){
        if(n%i==0){
            prime = false
            break
        }
    }
    when(prime){
        true -> println("Prime")
        false -> println("Not Prime")
    }

}