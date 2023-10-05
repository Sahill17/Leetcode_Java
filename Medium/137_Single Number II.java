class Solution {
    public int singleNumber(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();

        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num,0) + 1);
        // }

        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue() == 1){
        //         return entry.getKey();
        //     }
        // }
        // return -1;
        Arrays.sort(nums);
        int count = 0;
        int ele = nums[0];

        for(int i =0;i<nums.length;i++){
            if(nums[i] == ele){
                count++;
            }
            else if(nums[i] != ele){
                if(count != 3){
                    return ele;
                }

                ele = nums[i];
                count = 1;
            }
        }
        return ele;
    }
}