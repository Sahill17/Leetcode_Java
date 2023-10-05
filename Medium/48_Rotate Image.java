class Solution {
    
    public static void transpose(int [][]arr){
        
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<i;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
           }
       } 
        
    }
      public static void reverse(int [][]arr){
       
       for(int r=0;r<arr.length;r++){
           int l=0,right=arr.length-1;
          while(l<right){
             int temp=arr[r][l];
              arr[r][l]=arr[r][right];
              arr[r][right]=temp;
              l++;
              right--;
              
          }           
     }             
}
    public void rotate(int[][] matrix) {      
       transpose(matrix);
        reverse(matrix);       
    }
}