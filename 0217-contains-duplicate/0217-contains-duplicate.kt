class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.distinct().size != nums.size
    }
}