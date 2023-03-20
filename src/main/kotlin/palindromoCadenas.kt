fun main() {
    var word = readln()
    word = word.replace(" ", "").lowercase()
    println(checkWordPalindrome(word))
}

fun checkWordPalindrome(word: String): Boolean = word.reversed() == word
