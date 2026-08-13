class Solution {
    boolean dfs(String s, int i, int j, char[][] board, String word, int[][] visited)
    {
        if(s.length() == word.length()) {
            return s.equals(word);
        }

        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] == 1) {
            return false;
        }
        
        visited[i][j] = 1;

        int[][] dirs = {{0, -1}, {-1, 0}, {1, 0}, {0, 1}};

        for(int k = 0; k < 4; k++)
        {
            if(dfs(s + board[i][j], i + dirs[k][0], j + dirs[k][1], board, word, visited)) {
                return true;
            }
        }

        visited[i][j] = 0;

        return false;
    }

    public boolean exist(char[][] board, String word) {
        int[][] visited = new int[board.length][board[0].length];

        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(dfs("", i, j, board, word, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
}
