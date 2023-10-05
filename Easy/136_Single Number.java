class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            if(map.contains(nums[i])){
                map.remove(nums[i]);
            }
            else{
                map.add(nums[i]);
            }
        }
        return map.iterator().next();
    }
}