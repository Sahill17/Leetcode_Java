class Solution {
    public int mySqrt(int x) {
       long s = 0;
       long e = x;
       long ans = 0;
       while(s <= e){
           long mid = s + (e - s) /2;
           if(mid*mid < x){
               s = mid + 1;
               ans = mid;
           }
           else if(mid*mid > x){
               e = mid - 1;
           }
           else{
               return (int)mid;
           }
       }
       return (int)ans;
    }
}