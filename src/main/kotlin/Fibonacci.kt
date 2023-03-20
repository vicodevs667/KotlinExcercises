fun main() {
    println("Introduzca numero de terminos:")
    var number = readln().toInt()
    val result = fibonacci(n = number)
    println(result)
}

fun fibonacci(n: Int): List<Int> {
    var firstNumber = 0
    var secondNumber = 1
    val result = mutableListOf(0,1)
    (3 .. n).forEach {
        val sum = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = sum
        result.add(sum)
    }
    return result
}