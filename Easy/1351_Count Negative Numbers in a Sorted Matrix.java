class Solution {
    public int countNegatives(int[][] grid) {
        //  T - O(m*n)  S - O(1) will work also if grid is not sorted 
        if(grid == null || grid.length == 0){
            return 0;
        }
        int count = 0;
        for(int i = 0;i<=grid.length-1;i++){
            for(int j = 0;j <= grid[i].length-1;j++){
                if(grid[i][j] < 0){
                   count += (grid[i].length-j);
                   break;
                }
            }
        }
        return count;
    }
}

// countOfNeg += (grid[i].length-j); break;