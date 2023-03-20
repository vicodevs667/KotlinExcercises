/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 */
fun main() {
    val nums = intArrayOf(100,4,200,1,3,2,3)
    val result = longestConsecutive(nums)
    println(result)
}

fun longestConsecutive(nums: IntArray): Int {
    var maxValue = 0
    val setNums  = nums.toSet()
    nums.forEach { number ->
        if (number - 1 !in setNums) {
            var length = 1
            while (setNums.contains(number + length)) {
                length += 1
            }
            maxValue = maxOf(maxValue, length)
        }
    }
    return maxValue
}
