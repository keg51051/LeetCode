class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        var answer = false
        for (i in arr.indices) {
            for (j in arr.indices) {
                if (i != j && arr[i] == arr[j]*2) {
                    answer = true
                }
            }
        }
        return answer
    }
}