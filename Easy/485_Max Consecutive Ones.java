// While loop -> More efficient

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int maximum=0;
        int i=0;
        while(i<nums.length)
        {
        int conOnes=0;
        while(i< nums.length && nums[i]==1)
        {
        conOnes++;
        i++;
        }
        maximum=Math.max(maximum,conOnes);
        i++;
        }
        return maximum; 
    }
}


// For loop

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i]==1){
                current++;
            } else {
                max = Math.max(max,current);
                current=0;
            }
        }
        return Math.max(max,current);
    }
}