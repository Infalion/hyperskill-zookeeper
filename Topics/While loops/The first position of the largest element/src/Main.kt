//fun main() {
//    // put your code here
//    var i = 0
//    var pozic = 1
//    var temp = 0
//
//    while ( 0 != i = readln().toInt()) {
//
//        if(i > temp) temp = i
//        pozic++
//        }
//
//        println("$temp $pozic")
//}
import java.util.*

fun main() {
    var i = 1
    var pozic = 0
    var temp = Int.MIN_VALUE
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextInt()) {
        val next = scanner.nextInt()
        if(next > Int.MIN_VALUE && next != temp && next > temp) {
            temp = next
            pozic = i
        }
        i++
    }
    println("$temp $pozic")
    if(i % 2 == 0) println("EVEN") else println("ODD")
}
