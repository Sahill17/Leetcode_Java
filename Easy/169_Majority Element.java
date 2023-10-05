class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];

        // Moore Voting Algorithm
        int count = 0;
        int ans = 0;
        for(int num : nums){
            if(count == 0){
                ans = num;
            }

            if(num == ans) {
                count++;
            }
            else {
                count--;
            }
        }   
        return ans;
    }
}