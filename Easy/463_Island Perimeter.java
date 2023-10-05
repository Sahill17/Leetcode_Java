class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                if(grid[i][j] == 0){
                    continue;
                }
                perimeter += 4;
                if(i > 0){
                    // if not first row, cause first row will have water on top
                    perimeter -= grid[i-1][j];
                }
                if(j > 0){
                    // if not first column, cause first column will have water on left
                    perimeter -= grid[i][j-1];
                }
                if(i < row-1){
                    // if not not last row, cause last row will have water on bottom
                    perimeter -= grid[i+1][j];
                }
                if(j < col-1){
                    // if not last column, cause last column will have water on rigth
                    perimeter -= grid[i][j+1];
                }
            }
        }
        return perimeter;
    }
}