fun main() {
    val number = readln().toInt()
    checkPalindrome(number)
}

fun checkPalindrome(number: Int) {
    var originalNumber = number
    var reversedNumber = 0
    var remainder = 0
    while (originalNumber != 0) {
        remainder = originalNumber % 10
        reversedNumber = reversedNumber * 10 + remainder
        originalNumber /= 10
    }
    println( if (reversedNumber == number)  "$number es palindromo" else "$number no es palindromo")
}
