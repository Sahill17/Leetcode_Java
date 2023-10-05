class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
       int res = 1; // first will be counted as first unique
       for(int i = 0;i < nums.length -1;i++){
           if(nums[i] < nums[i+1]){   // increasing order so previous element should be less than next element or equals, so it means if it's  then we got our second unique element 
               nums[res] = nums[i+1]; // now set arrays next index value as that element
               res++; // and increase the value of unique numbers 
           }
       }
       return res;
    }
}
