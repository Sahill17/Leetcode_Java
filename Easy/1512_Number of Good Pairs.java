// O(n^2)

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                if(nums[i] == nums[j]){
                    ans++;
                }
            }
        }
        return ans;
    }
}

// O(n * k)

/*
The formula i * (i - 1) / 2 comes from combinatorics, and it's used to calculate how many pairs can be made from a group of i identical items. Here's a simple breakdown:

Explanation:
Suppose you have i items, and you want to know how many ways you can pick 2 of them to form a pair.
The number of ways to select 2 items from i items is given by the formula for combinations:

(i 2) = ((i) * (i-1)) / 2

This is called "i choose 2."
Why this works:
If you have i identical items, say 4 items (i = 4), you can think of it like this:
For the first item, you can pair it with 3 others.
For the second item, you can pair it with 2 remaining others (because you already counted the first pair).
For the third item, you can pair it with 1 remaining item.
So the total number of pairs is:

3 + 2 + 1 = 6

This is the same as the formula i * (i - 1) / 2, where:

4 * 3 / 2 = 6

It gives the number of unique pairs you can make.


The formula works because it counts how many unique ways you can pair up items without repeating pairs, and it saves time compared to comparing every single pair individually.

 */

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] tmp = new int[102];
        for(int num : nums){
            tmp[num]++;
        }
        int ans = 0;
        for(int i : tmp){
            ans += ((i) * (i-1)) / 2;
        }
        return ans;
     }
}