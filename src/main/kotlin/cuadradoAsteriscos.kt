fun main() {
    val sides = readln().toInt()
    squareStars(sides)
}

fun squareStars(sides: Int) {
    (1..sides).forEach {
        if (it == 1 || it == sides) {
            println()
        }
    }
}
