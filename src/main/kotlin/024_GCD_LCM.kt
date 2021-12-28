fun main(){
    print("Enter n: ")
    val n = readLine()!!.toInt()
    print("Enter m: ")
    val m = readLine()!!.toInt()
    var _n = n
    var _m = m
    var gcd = 1
    var r = 0
    while (_n > 0 && m > 0){
        r = _n % _m
        if(r == 0){
            if (_n < _m) gcd = _n
            else gcd = _m
            break
        }
        _n = _m
        _m = r
    }

    println("LCM = ${n*m/gcd}")
    println("GCD = $gcd")
}

fun main1(args: Array<String>)
{
    println("Enter A,B: ")
    var a=readLine()!!.toInt()
    var b= readLine()!!.toInt()
    val temp1=a
    val temp2=b
    var r=a%b
    while (r>0)
    {
        a=b
        b=r
        r=a%b
    }
    val gcd=if (a<b) a else b
    println("GCD $temp1 and $temp2 is $gcd")
    println("LCM $temp1 and $temp2 is ${temp1*temp2/gcd}")

}