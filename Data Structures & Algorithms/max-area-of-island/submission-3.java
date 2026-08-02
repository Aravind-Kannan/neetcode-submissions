class Solution {
    int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int bfs(int[][] grid, int r, int c)
    {
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = 0;
        int area = 1;
        q.add(new int[]{r, c});

        while(q.size() > 0)
        {
            int[] front = q.poll();
            int fr = front[0], fc = front[1];
            for(int[] dir: dirs)
            {
                int nr = fr + dir[0], nc = fc + dir[1];
                if(
                    nr >= 0 && nr < grid.length &&
                    nc >= 0 && nc < grid[0].length &&
                    grid[nr][nc] == 1
                ) {
                    area++;
                    grid[nr][nc] = 0;
                    q.add(new int[]{nr, nc});
                }
            }
        }
        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        int area = 0;

        for(int i = 0; i < ROWS; i++)
        {
            for(int j = 0; j < COLS; j++)
            {
                if(grid[i][j] == 1)
                {
                    area = Math.max(area, bfs(grid, i, j));
                }
            }
        }
        return area;
    }
}
