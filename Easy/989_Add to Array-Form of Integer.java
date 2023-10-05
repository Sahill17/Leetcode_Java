class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        int n = num.length;
        int index = n - 1;
        
        List<Integer> ans = new ArrayList<>();
        
        while(index>=0 || k>0){
            if(index>=0){
                ans.add((num[index]+k)%10);
                k=(num[index]+k)/10;
            }
            else{
                ans.add(k % 10);
                k/=10;
            }
            index--;
        }
        Collections.reverse(ans);
        return ans;
    }
}