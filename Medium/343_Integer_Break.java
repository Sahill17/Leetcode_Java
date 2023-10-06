class Solution {
  static int[] dp;
  static int find(int n, boolean flag){
      if(n < 2)
        return 1;
      if(dp[n] != 0)
        return dp[n];
      int max = -1;
      for(int i = 1; i <= n; i++){
        if(i == n && !flag){
             break;
        }
       max = (int)Math.max(max, i * find(n - i,true));
        }
       return dp[n] = max;  
  }
    public int integerBreak(int n) {
      dp = new int[59];
      return find(n, false);
    }
}
