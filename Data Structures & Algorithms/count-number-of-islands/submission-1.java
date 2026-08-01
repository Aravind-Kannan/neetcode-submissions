class Solution {
    void dfs(char[][] grid, int i, int j, int rows, int cols)
    {
        grid[i][j] = '0';

        int[][] dirs = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
        for(int k = 0; k < dirs.length; k++) 
        {
            int x = i + dirs[k][0];
            int y = j + dirs[k][1];
            if(x >= 0 && x < rows && y >= 0 && y < cols)
            {
                if(grid[x][y] == '1')
                dfs(grid, x, y, rows, cols);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int count = 0, rows = grid.length, cols = grid[0].length;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(grid[i][j] == '1')
                {
                    dfs(grid, i, j, rows, cols);
                    count++;
                }
            }
        }

        return count;
    }
}
