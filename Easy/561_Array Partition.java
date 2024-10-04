class Solution {
    public int arrayPairSum(int[] nums) {
    /*
    arr = [1,4,3,2]
    We can get min from each pair, and we want max sum out of all the pairs. So to do that, we can pair up two minimum numbers and sacrifice one. and on the other hand we'll pair up two larest number and sacrifice larest but get least largest.

    Here we take 1 and 2 -> 1
    4 and 3 -> 3
    hence 3 + 1 -> 4

    We can do this more easily if array is sorted.
    [1,2,3,4]
    we'll just have to pair up two adjacent elements and pair them up.
    1,2 -> 1
    3,4 -> 3
    Arrays.sort(nums);
    int ans = 0;
    for(int i = 1; i < nums.length; i+=2){
        ans = ans + Math.min(nums[i],nums[i-1]);
    }
    return ans;
    */
        Arrays.sort(nums);
        // Initialize sum to zero
        int maxSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            // Add every element at even positions (0-indexed)
            maxSum += nums[i];
        }
        return maxSum;
    }
}