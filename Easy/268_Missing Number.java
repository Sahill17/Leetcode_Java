class Solution {
    public int missingNumber(int[] nums) {
        // int len = nums.length;
        // int givenSum = 0;
        // int lengthSum = 0;
        // for(int i =0;i <= len; i++){
        //     lengthSum += i;
        // }
        // for(int num:nums){
        //     givenSum += num;
        // }

        // int ans = lengthSum - givenSum;
        // return ans;
        int i = 0;
        int n = nums.length;
        while(i < n){
            int index = nums[i];
            if(nums[i] < n && nums[i] != nums[index]){
                swap(nums,i,index);
            }
            else {
                i++;
            }
        }
        for(int j = 0; j < n; j++){
            if(nums[j] != j){
                return j;
            }
        }
        return n;
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;  
    }
}