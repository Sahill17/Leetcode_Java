class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num,0) + 1);
        // }
        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue() > 1){
        //         return true;
        //     }
        // }
        // return false;
        for(int num : nums){
            if (map.containsKey(num) && map.get(num) >= 1)
                return true;
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return false;
    }
}