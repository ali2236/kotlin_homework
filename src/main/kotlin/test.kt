import kotlin.random.Random

fun main(args: Array<String>) {
    for(i in 0..100){
        print(Random.nextInt(0, 2).toString() + "\t")
    }
}