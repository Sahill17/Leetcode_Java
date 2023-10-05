class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        return nums[pivot+1];
    }

    int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(end > mid && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(start < mid && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] <= nums[start]){
                end = mid - 1; 
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}