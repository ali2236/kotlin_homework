fun main(){

    print("Enter Array: ")

    val a = readLine()!!
        .trim()
        .split(' ')
        .map { it.toInt() }
        .toIntArray()

    if(a.isEmpty()) return

    var min = a.first()
    var max = a.first()

    for (num in a){
        if(num > max) max = num
        if(num < min) min = num
    }

    println("""
        Max is $max
        Min is $min
    """.trimIndent())
}