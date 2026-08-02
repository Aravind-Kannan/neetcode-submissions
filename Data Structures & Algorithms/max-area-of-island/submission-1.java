class Solution {
    int dfs(int[][] grid, int i, int j, int area)
    {
        grid[i][j] = 0;
        area++;
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for(int k = 0; k < dirs.length; k++) 
        {
            int x = i + dirs[k][0];
            int y = j + dirs[k][1];
            if(
                x >= 0 && x < grid.length &&
                y >= 0 && y < grid[0].length &&
                grid[x][y] == 1
            ) 
            {
                area = dfs(grid, x, y, area);
            }
        }
        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int ROWS = grid.length, COLS = grid[0].length;
        for(int i = 0; i < ROWS; i++)
        {
            for(int j = 0; j < COLS; j++)
            {
                if(grid[i][j] == 1) 
                maxArea = Math.max(maxArea, dfs(grid, i, j, 0));
            }
        }
        return maxArea;
    }
}
