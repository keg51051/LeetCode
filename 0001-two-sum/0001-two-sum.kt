class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var answer = intArrayOf()
        for (i in nums.indices) {
            for (j in 1 until nums.size) {
                if (nums[i] + nums[j] == target && i != j) {
                    answer += i
                    answer += j
                    break
                }
            }
            if (answer.size == 2) break
        }
        return answer
    }
}