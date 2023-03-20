fun main() {
    val word = readln().lowercase()
    reversedWord(word)
}

fun reversedWord(word: String) {
    var reverse = ""
    (word.indices).forEach {
        reverse = word[it] + reverse
    }
    println(reverse)
}
