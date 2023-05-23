class Solution {
    fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
        val rows = heights.size
        val cols = heights[0].size
        var pac = Array(rows){BooleanArray(cols)}
        var atl = Array(rows){BooleanArray(cols)}
        var result = mutableListOf<List<Int>>()
        
        for (row in 0 until rows) {
            dfs(row, 0, rows, cols, pac, heights[row][0], heights)
            dfs(row, cols-1, rows, cols, atl, heights[row][cols-1], heights)
        }
        
        for (col in 0 until cols) {
            dfs(0, col, rows, cols, pac, heights[0][col], heights)
            dfs(rows-1, col, rows, cols, atl, heights[rows-1][col], heights)
        }
        
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (pac[i][j] && atl[i][j]) result.add(intArrayOf(i,j).toList())
            }
        }
        
        return result
    }
    
    fun dfs(row: Int, col: Int, rows: Int, cols: Int, visited: Array<BooleanArray>, prevHeight: Int, heights: Array<IntArray>) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col] || prevHeight > heights[row][col]) return
        visited[row][col] = true
        dfs(row+1, col, rows, cols, visited, heights[row][col], heights)
        dfs(row-1, col, rows, cols, visited, heights[row][col], heights)
        dfs(row, col+1, rows, cols, visited, heights[row][col], heights)
        dfs(row, col-1, rows, cols, visited, heights[row][col], heights)
    }
}