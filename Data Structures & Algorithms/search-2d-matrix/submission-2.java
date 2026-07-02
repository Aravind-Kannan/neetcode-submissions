class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int l = 0, r = (rows * cols) - 1;
        
        while(l <= r)
        {
            int mid = (l + r)/2;
            int i = mid / cols;
            int j = mid % cols;

            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }

        return false;
    }
}
