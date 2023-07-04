class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        //answer array
        int[][] ans = new  int [m][n];
        //to check how many odd numbers are there
        int count = 0;
        
        //checking indices arry 
        for(int i =0;i<indices.length;i++){
            //to change column while row same 
            for(int j = 0;j<n;j++){
                ans[indices[i][0]][j]++;
            }
            //to change row while column same 
            for(int j=0;j<m;j++){
                ans[j][indices[i][1]]++;
            }
        }
        //to count total odd numbers
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ans[i][j] % 2 != 0){
                    //if number is odd count will be incremented
                    count++;
                }
            }
        }
        return count;
    }
}