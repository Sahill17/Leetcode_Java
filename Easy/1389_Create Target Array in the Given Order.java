class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        
        int [] ans = new int [n];
        ArrayList<Integer> target = new ArrayList<>();
        
        for(int i = 0;i < n;i++){
            target.add(index[i],nums[i]);
        }
        for(int i = 0;i < n;i++){
            ans[i] = target.get(i);
        }
        return ans;
    }
}

// Python

/* 
class Solution(object):
    def createTargetArray(self, nums, index):
        """
        :type nums: List[int]
        :type index: List[int]
        :rtype: List[int]
        """
        target = []
        for i in range(len(nums)):
            target.insert(index[i],nums[i])
        return target
*/

// Go

/*
func createTargetArray(nums []int, index []int) []int {
    target := []int{}
    for i := 0; i < len(nums); i++{
        idx := index[i]
        val := nums[i]

        if idx >= len(target){
            target = append(target,val)
        } else {
            target = append(target[:idx+1],target[idx:]...)
            target[idx] = val
        }
    }
    return target
}
 */