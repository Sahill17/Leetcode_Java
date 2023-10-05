class Solution {
    public void sortColors(int[] nums) {
        boolean swap;
        for(int i = 0; i < nums.length; i++){
            swap = false;
            for(int j = 1; j < nums.length - i; j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    swap = true; 
                }
            }
            if(!swap){
                break;
            }
        }
    }
}