class Solution {
    public int diagonalSum(int[][] mat) {
        
        int ans = 0;
        int n = mat.length;
        
        for(int i =0;i<n;i++){
            ans += (mat[i][i]+mat[i][n-i-1]);
        }
        if(n % 2 == 0){
            return ans;
        }
        else{
            return ans - mat[n/2][n/2];
        }
    }
}

// Matrix can be odd or even ,
 
// 1.   if number of columns / rows is even then 
//      answer = sum of both diagonals 
     
// 2.  else number columns / rows is odd then 
//      answer = sum of both diagonals - middle element ( mat[n/2][n/2] )
