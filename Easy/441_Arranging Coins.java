class Solution {
    public int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        long k,current;
        while(left <= right){
            k = left + (right - left) / 2;
            current = k * (k + 1) / 2;

            if(current == n) return (int)k;

            if(n < current) {
                right = k - 1;
                
            } 
            else {
                left = k + 1;
            }
        }
        return (int)right;
    }
}