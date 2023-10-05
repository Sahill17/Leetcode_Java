class Solution {
    public int findDuplicate(int[] nums) {
    //     int i = 0;
    //     while(i < nums.length){
    //         if(nums[i]  != i + 1){
    //             int correct = nums[i] - 1;
    //             if(nums[i] != nums[correct]){
    //                 swap(nums,i,correct);
    //             }
    //             else{
    //                 return nums[i];
    //             }
    //         }
    //         else {
    //             i++;            
    //         }
    //     }
    //     return -1;
    // }

    // static void swap(int[] arr,int a, int b){
    //     int temp = arr[a];
    //     arr[a] = arr[b];
    //     arr[b] = temp;
    // }
    HashSet<Integer> set = new HashSet<>();
    for(int num : nums){
        if(!set.add(num)){
            return num;
            }
        }
        return -1;
    }
}