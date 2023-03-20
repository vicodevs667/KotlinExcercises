fun main() {
    val sentence = "hola soy una palabra en una frase, PALABRA"
    val word = readln()
    println(findWordOcurrences(sentence.lowercase(), word))
}

fun findWordOcurrences(sentence: String, word: String): Int {
    var listWords: List<String> = sentence.split(" ")
    return listWords.count { it == word }
}
