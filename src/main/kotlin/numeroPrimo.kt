fun main() {
    var number = readln().toInt()
    isPrime(number)
}

fun isPrime(number: Int) {
    var cont = 0
    (1..number).forEach {
        if (number % it == 0) cont++
    }
    if (cont == 2) println("$number es número primo") else println("$number no es número primo")
}
