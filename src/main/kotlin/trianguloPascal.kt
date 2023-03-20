
/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Example
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Input: numRows = 1
Output: [[1]]
 */
fun main() {
    val numRows = readln().toInt()
    val result = generate(numRows)
    println(result)
}

fun generate(numRows: Int): List<List<Int>> {
    val rows = mutableListOf<List<Int>>()
    val pascaleLineMap = mutableMapOf<Int, List<Int>>()
    (1..numRows).forEach { lineNumber ->
        rows.add(pascaleLine(lineNumber, pascaleLineMap))
    }
    return rows
}

fun pascaleLine(lineNumber: Int, pascaleLineMap: MutableMap<Int, List<Int>>): List<Int> {
    if (lineNumber == 1) return listOf(1)
    if (lineNumber == 2) return listOf(1, 1)
    if (pascaleLineMap.containsKey(lineNumber)) return pascaleLineMap[lineNumber]!!

    val row = mutableListOf<Int>()
    row.add(1)

    val previous = pascaleLine(lineNumber - 1, pascaleLineMap)
    for (i in 1 until lineNumber - 1) {
        row.add(previous[i-1] + previous[i])
    }
    row.add(1)
    return row.also { pascaleLineMap[lineNumber] = it }

}
