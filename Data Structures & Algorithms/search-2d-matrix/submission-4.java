class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length, COLS = matrix[0].length;
        int l = 0, r = ROWS * COLS - 1;
        

        while(l <= r)
        {
            int mid = (l + r) / 2;
            int x = mid / COLS, y = mid % COLS;
            // System.out.println(mid + " " + x + " " + y);
            if(matrix[x][y] == target) return true;
            else if(matrix[x][y] < target) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return false;
    }
}
