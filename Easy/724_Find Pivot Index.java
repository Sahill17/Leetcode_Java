class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num : nums){
            total += num;
        }

        int leftSum = 0;
        for(int i =0;i < nums.length; i++){
            int rigthSum = total - leftSum - nums[i];
            if(leftSum == rigthSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}