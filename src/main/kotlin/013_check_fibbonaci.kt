fun main(){
    print("Enter n: ")
    val n = readLine()!!.toInt()
    var a = 0
    var b = 1
    var c = 1
    while (b <= n){
        c = a + b
        if(c == n) break
        a = b
        b = c
    }
    println(if (c == n) "Yes" else "No")
}