class Solution {
    fun romanToInt(s: String): Int {
        var answer = 0
        var prev = 0
        val map = mutableMapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        
        for (i in s.length-1 downTo 0) {
            val current = map[s[i]] ?: 0
            
            if (current < prev) {
                answer -= current
            } else {
                answer += current
            }
            
            prev = current
        }
        
        return answer
    }
}