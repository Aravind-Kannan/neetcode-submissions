class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++)
        {
            Set<Character> s = new HashSet<>();
            for(int j = 0; j < 9; j++)
            {
                if(s.contains(board[i][j])) return false;
                if(board[i][j] != '.') s.add(board[i][j]);
            }
        }

        for(int i = 0; i < 9; i++)
        {
            Set<Character> s = new HashSet<>();
            for(int j = 0; j < 9; j++)
            {
                if(s.contains(board[j][i])) return false;
                if(board[j][i] != '.') s.add(board[j][i]);
            }
        }

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                Set<Character> s = new HashSet<>();
                for(int k = 3 * i; k < 3 * i + 3; k++)
                {
                    for(int l = 3 * j; l < 3 * j + 3; l++)
                    {
                        if(s.contains(board[k][l])) return false;
                if(board[k][l] != '.') s.add(board[k][l]);
                    }
                }
            }
        }

        System.out.println("2");


        return true;
    }
}
