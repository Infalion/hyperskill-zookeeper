fun main() {
    // put your code here
    var duration = readln().toInt()
    val food = readln().toInt()
    val flight = readln().toInt()
    val hotel = readln().toInt()
    println(food * duration + hotel * --duration + flight * 2)

}
