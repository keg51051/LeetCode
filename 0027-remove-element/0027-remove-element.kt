class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var a = 0
        nums.forEach { if(it != `val`) nums[a++] = it }
        return a
    }
}