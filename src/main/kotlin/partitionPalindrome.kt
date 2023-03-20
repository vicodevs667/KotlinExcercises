import java.util.*

/*
Given a string s, partition s such that every
substring
of the partition is a
palindrome
Return all possible palindrome partitioning of s.
 */
fun main() {
    val s = readln()
    val result = partition(s)
    println(result)
}

fun partition(s: String): List<List<String>> {
    val allPalindromes = findAllPalindromes(s)
    // O(n * 2^n)
    Collections.sort(allPalindromes) { a, b -> a.start.compareTo(b.start) }
    return partition(s, 0, allPalindromes).filter { it.isNotEmpty() }
}

fun partition(s: String, start: Int, allPalindromes: List<PRange>) : List<List<String>> {
    if (start == s.length - 1) return listOf(listOf(s[start].toString()))
    val possiblePalindromes = allPalindromes.filter { it.start == start}
    val result = mutableListOf<List<String>>()
    for (p in possiblePalindromes) {
        if (p.end == s.length - 1) {
            result.add(listOf(s.substring(p.start, p.end+1)))
            continue
        }
        val partitions = partition(s, p.end + 1, allPalindromes)
        partitions.forEach {
            val current = mutableListOf<String>()
            current.add(s.substring(p.start, p.end+1))
            current.addAll(it)
            result.add(current)
        }
    }
    return result
}

fun findAllPalindromes(s: String): List<PRange> {
    val result = mutableListOf<PRange>()
    for (i in s.indices) {
        result.addAll(findPalindromes(s, i, i))
        result.addAll(findPalindromes(s, i, i+1))
    }
    return result
}

fun findPalindromes(s: String, start: Int, end: Int): List<PRange> {
    val result = mutableListOf<PRange>()
    if (end >= s.length) return result
    var left = start
    var right = end

    while (left >= 0 && right < s.length && s[left] == s[right]) {
        result.add(PRange(left, right))
        left--
        right++
    }
    return result
}

data class PRange(val start: Int, val end: Int)