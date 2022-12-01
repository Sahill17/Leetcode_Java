class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        int n = nums.length;
        
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;                
                }
            }
        }
        return ans;
        
        int[] ans = new int[2]; 
        HashMap<Integer,Integer> map = new HashMap();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
            }
          else{
                   map.put(nums[i],i);                                                     
          }
        }
     return ans;
    }
}
