class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        return search(matrix, target);
    }

    static boolean bs(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int middle = colStart + (colEnd - colStart) / 2;
            if (matrix[row][middle] == target) {
                return true;
            }
            if (matrix[row][middle] < target) {
                colStart = middle + 1;
            } else {
                colEnd = middle - 1;
            }
        }
        return false;
    }

    static boolean search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = rows - 1; // Start from the last row
        int col = 0; // Start from the first column

        while (row >= 0 && col < cols) {
            if (matrix[row][col] == target) {
                return true;
            }
            if (matrix[row][col] > target) {
                row--; // Move up to the previous row
            } else {
                col++; // Move right to the next column
            }
        }

        return false;
    }
}
