fun main() {
    val a = readLine()!!
        .split(' ')
        .map { it.toInt() }
        .toIntArray()

    var n = a.size

    for (i in 0 until n) {
        var j = i + 1
        while (j < n) {
            if (a[i] == a[j]) {
                for (k in j until n - 1){
                    a[k] = a[k+1]
                }
                n--
            } else {
                j++
            }
        }
    }

    println(a.take(n).joinToString(" "))
}