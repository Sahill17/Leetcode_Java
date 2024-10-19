import java.util.Arrays;

class Solution {
    public int maximumSwap(int num) {
        char[] nums = Integer.toString(num).toCharArray();
        int n = nums.length;

        int[] maxRight = new int[10];
        Arrays.fill(maxRight,-1);

        for(int i = 0; i<n; i++){
            int idx = nums[i]-'0';
            maxRight[idx] = i;
        }

        for(int i = 0; i<n; i++){
            char currChar = nums[i];
            int currDigit = currChar-'0';

            for(int digit = 9; digit>currDigit; digit--){
                if(maxRight[digit]>i){
                    swap(nums,i,maxRight[digit]);
                    return Integer.parseInt(new String(nums));
                }
            }
        }
        return num;
    }

    public void swap(char[] nums, int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}