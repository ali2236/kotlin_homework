fun main(args: Array<String>) {

    // input
    val stringNumbers = readLine()!!.split(' ')
    val n = stringNumbers.size
    val arr = IntArray(n)
    for (i in 0 until n){
        arr[i] = stringNumbers[i].toInt()
    }

    val a = Array(n) {i -> stringNumbers[i].toInt()}

    // bubble sort
    for (i in 0 until n){
        for (j in 0 until n-1){
            if(arr[j] > arr[j + 1]){
                val t = arr[j]
                arr[j] = arr[j+1]///.also { arr[j+1] = a[j] }
                arr[j+1] = t
            }
        }
    }

    // output
    println(arr.joinToString(" "))
}