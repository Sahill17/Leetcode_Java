class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];
        for(int i =0;i < n;i++){
            ans[i] = getAns(intervals,intervals[i][1]);
        }
        return ans;
    }

    private int getAns(int[][] intervals,int key){
        for(int i = 0;i < intervals.length; i++){
            if(key == intervals[i][0]){
                return i;
            }
          
        }
        for(int i = 0; i < intervals.length; i++){
            if(key < intervals[i][0]){
                return i;
            }
        }
        return -1;
    }
}