fun main() {
    // put your code here
    val h1 = readln().toInt()
    val m1 = readln().toInt()
    val s1 = readln().toInt()

    val h2 = readln().toInt()
    val m2 = readln().toInt()
    val s2 = readln().toInt()

    println((h2 * 3600 + m2 * 60 + s2)-(h1 * 3600 + m1 * 60 + s1))

}
