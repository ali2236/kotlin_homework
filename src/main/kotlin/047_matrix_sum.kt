fun main(args: Array<String>) {

    // input
    print("Dimension: ")
    val n = readLine()!!.toInt()
    val m = readLine()!!.toInt()
    val readMatrix = {
        Array(n) { i ->
            Array(m) { j ->
                print("Enter ($i,  $j):")
                readLine()!!.toInt()
            }
        }
    }

    println("Enter m1:")
    val m1 = readMatrix()
    println("Enter m2:")
    val m2 = readMatrix()

    val m3 = Array(n) { i ->
        Array(m) { j ->
            m1[i][j] + m2[i][j]
        }
    }

    println(m3.joinToString(separator = "\n"){ it.joinToString("\t") })
}
