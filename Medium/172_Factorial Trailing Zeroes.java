class Solution {
    public int trailingZeroes(int n) {
        // no need to  get full factorial cause 
        // trailing zeros only comes when number is multiplyed by 10 or (2*5)
        // n / 5 + n / 25 + n / 125 + n / 625 + ... until the division returns more than zero.
        int ans = 0;
        for(int i = 5; i <= n; i *= 5){
            ans = ans + n / i;
        }
        return ans;
    }
}