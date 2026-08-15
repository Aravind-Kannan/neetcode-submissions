class Solution {
    public int orangesRotting(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length, fresh = 0, minutes = 0;
        int[][] DIRS = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < ROWS; i++)
        {
            for(int j = 0; j < COLS; j++)
            {
                if(grid[i][j] == 2) 
                {
                    q.offer(new int[]{i, j});
                }
                if(grid[i][j] == 1) fresh++;
            }
        }

        while(fresh > 0 && !q.isEmpty())
        {
            int SIZE = q.size();
            for(int i = 0; i < SIZE; i++)
            {
                int[] cur = q.poll();
                int r = cur[0], c = cur[1];

                for(int[] dir: DIRS)
                {
                    int dr = dir[0], dc = dir[1];
                    int nr = r + dr, nc = c + dc;

                    if(0 <= nr && nr < ROWS && 0 <= nc && nc < COLS && grid[nr][nc] == 1)
                    {
                        grid[nr][nc] = 2;
                        q.offer(new int[]{nr, nc});
                        fresh--;
                    }
                }
            }
            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}
