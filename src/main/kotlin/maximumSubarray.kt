/*
Given an integer array nums, find the
subarray
with the largest sum, and return its sum.
 */
fun main() {
    val nums = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
    val result = maxSubArray(nums)
    println(result)
}

fun maxSubArray(nums: IntArray): Int {
    var max = Int.MIN_VALUE
    var current = 0
    nums.forEach { number ->
        current = maxOf(current + number, number) //5
        max = maxOf(max, current) // 5
    }
    return max
}
