class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] dirs = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 2)
                {
                    q.offer(new int[]{i, j});
                }
            }
        }

        int minutes = 0;
        while(!q.isEmpty())
        {
            int s = q.size();
            for(int i = 0; i < s; i++)
            {
                int[] f = q.poll();
                for(int j = 0; j < dirs.length; j++)
                {
                    int nx = f[0] + dirs[j][0];
                    int ny = f[1] + dirs[j][1];
                    if(0 <= nx && nx < grid.length &&
                    0 <= ny && ny < grid[0].length && grid[nx][ny] == 1) {
                    grid[nx][ny] = 2;
                    q.offer(new int[]{nx, ny});
                    }
                }
            }
            if(!q.isEmpty())
            minutes++;
        }

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    return -1;
                }
            }
        }

        return minutes;
    }
}
