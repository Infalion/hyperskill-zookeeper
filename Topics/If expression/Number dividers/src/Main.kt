fun main() {
    // put your code here
    val n = readln().toInt()
    if (n % 2 == 0) {
        println("Divided by 2")
        if (n % 3 == 0) {
            println("Divided by 6")
        }
    }
    if(n % 3 == 0) println("Divided by 3")

            if(n % 5 == 0) println("Divided by 5")
        }
