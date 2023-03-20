/*
Given a string s, find the lenght of the longest substring witouth repeating characters
example: S = "abcabcbb" output = 3
 */

fun main() {
    var words = readln()
    var longitude = lenghtOfLongestSubstring(words)
    println(longitude)
}

fun lenghtOfLongestSubstring(words: String): Int {
    val mapResult = HashMap<Char, Int>()
    var length = 0
    val sArray = words.toCharArray()
    var left  = 0
    (sArray.indices).forEach { right ->
        val current = sArray[right] // a
        mapResult[current]?.let{currentIndex ->
            left = maxOf(left, currentIndex)
        }
        length = maxOf(length, (right - left) + 1 )
        mapResult[current] = right + 1
    }
    return length
}
