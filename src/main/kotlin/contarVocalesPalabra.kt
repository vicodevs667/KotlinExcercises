fun main() {
    var word = "Mi examen es en dos horas"
    word = word.replace(" ", "").lowercase()
    countVocals(word)
}

fun countVocals(word: String) {
    val vocals = listOf("a","e", "i","o","u")
    var cont = 0
    (vocals.indices).forEach { letter ->
        cont = word.count { it.toString() == vocals[letter] }
        println("${vocals[letter]}: $cont")
    }
}
