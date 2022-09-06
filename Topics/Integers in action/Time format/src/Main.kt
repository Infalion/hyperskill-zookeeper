fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    // enter your code
//    val hour = totalSeconds / (60 * 60 * 24)/60%60
//    val minut = totalSeconds % (60 * 60)/60
//    val sec = totalSeconds % (60 * 60)%60
//    println(totalSeconds % 3600 % 60 / 60)
//    println(hour)
//    println(minut)
//    println(sec)
    println("${totalSeconds % 3600 % 60 / 60 }:${totalSeconds % 3600/60 }:${totalSeconds % 3600 % 60}")
}
