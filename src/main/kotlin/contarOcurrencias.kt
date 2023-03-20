fun main() {
    var word = "Mi vieja mula ya no es lo que era"
    word = word.replace(" ", "").lowercase()
    countOccurrences(word)
}

fun countOccurrences(word: String) {
    var result = mutableMapOf<String, Int>()
    (word.indices).forEach { index ->
        var cont = word.count { it == word[index] }
        if (!result.containsKey(word[index].toString()))
            result[word[index].toString()] = cont
    }
    println(result.toList())
    result = result.toList().sortedBy { (_, value) -> value }.reversed().toMap() as MutableMap<String, Int>
    println(result)
}
