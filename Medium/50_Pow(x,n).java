class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long num = n;
        if(n < 0){
            num = (-1) * num; 
        }
        while(num > 0){
            if(num % 2 == 0){
                x *= x;
                num /= 2;
            }
            else{
                ans *= x;
                num -= 1;
            }
        }
        if(n < 0){
            return  (double)(1.0) / (double)ans;
        }
        return ans;
    }
}