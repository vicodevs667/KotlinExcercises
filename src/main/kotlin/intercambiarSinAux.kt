fun main() {
    var number1 = 10
    var number2 = 20

    number1 += number2
    number2 = number1 - number2
    number1 -= number2

    println("Variable 1 es: $number1")
    println("Variable 2 es: $number2")
}