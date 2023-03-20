fun main() {
    val number = readln().toInt()
    findFactorial(number)
}

fun findFactorial(number: Int) {
    var factorial:Long = 1
    for (i in 1..number) {
        factorial *= i.toLong()
    }
    println("El factorial de $number es: $factorial")
}
