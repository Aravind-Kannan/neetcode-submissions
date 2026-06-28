class Solution {
    public boolean isValidSudoku(char[][] board) {
        int r = board.length, c = board[0].length;

        // row-wise
        for(int i = 0; i < r; i++)
        {
            Set<Integer> rowSet = new HashSet<>();
            Set<Integer> colSet = new HashSet<>();
            for(int j = 0; j < c; j++)
            {
                if(board[i][j] != '.')
                {
                    if(rowSet.contains(board[i][j] - '0')) return false;
                    rowSet.add(board[i][j] - '0');
                }
                if(board[j][i] != '.')
                {
                    if(colSet.contains(board[j][i] - '0')) return false;
                    colSet.add(board[j][i] - '0');
                }
            }
        }

        // square-wise
        for(int x = 0; x < 3; x++)
        {
            for(int y = 0; y < 3; y++)
            {
                Set<Integer> squareSet = new HashSet<>();
                for(int i = 0; i < 3; i++)
                {
                    for(int j = 0; j < 3; j++)
                    {
                        int k = 3 * x + i;
                        int l = 3 * y + j; 
                        if(board[k][l] != '.')
                        {
                            if(squareSet.contains(board[k][l] - '0'))
                            {
                                return false;
                            }
                            squareSet.add(board[k][l] - '0');
                        }
                    }
                }
            }
        }

        return true;
    }
}
