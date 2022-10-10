class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[n*2];
        int index = 0;
        int Element = 0;
        while(index < n){
            
            ans[Element] = nums[index];
            ans[Element+1] = nums[index+n];
            
            Element+=2;
            index++;
            
        }
        return ans;
    }
}
