class Solution {
     public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]); // highest value in the array (maximum partition we can make => minmum Answer)   
            end += nums[i]; // sum of the array (if m is 1 => maximum Answer) 
        }

        // binary search
        while (start < end){
            // try for the middle
            int middle = start + (end - start) / 2;

            // calculate in many pieces you can divide this with max sum
            int sum = 0;
            int pieces = 1;
            for (int num: nums
                 ) {
                if (sum + num > middle) {
                    // cannot add more element in subArray, make new one
                    // can add this in new subArray ,then sum = num ( for new subArray )
                    sum = num;
                    pieces++;
                } else  {
                    // add elements together
                    sum += num;
                }
            }

            if(pieces > k){
                start = middle + 1;
            } else  {
                end = middle;
            }
        }
        return  end; // here start = end
    }
}