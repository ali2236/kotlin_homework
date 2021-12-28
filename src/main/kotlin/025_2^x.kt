
fun main(){
    print("Enter n: ")
    val n = readLine()!!.toInt()

    var c = 0
    for (i in 0..n.takeHighestOneBit()){
        val p2 = 1 shl i // 1 << i
        if (n and p2 == p2) c++ // &
    }

    println(c==1)

}