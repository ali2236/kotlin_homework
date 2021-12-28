fun main(){
    readLine()!!
        .split(' ')
        .map { it.toInt() }
        .average()
        .let { print(it) }
}