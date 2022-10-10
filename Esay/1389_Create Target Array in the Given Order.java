class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        
        int [] ans = new int [n];
        ArrayList<Integer> target = new ArrayList<>();
        
        for(int i = 0;i < n;i++){
            target.add(index[i],nums[i]);
        }
        for(int i = 0;i < n;i++){
            ans[i] = target.get(i);
        }
        return ans;
    }
}
