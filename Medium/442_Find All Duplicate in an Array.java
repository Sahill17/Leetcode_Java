class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0;index < nums.length;index++){
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    // List<Integer> ans = new ArrayList<>();
    // HashSet<Integer> set = new HashSet<>();
    // for(int num : nums){
    //     if(!set.add(num)){
    //         ans.add(num);
    //     }
    // }
    //     return ans;
    // }
}