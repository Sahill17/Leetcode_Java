class Solution {
    public boolean isPowerOfFour(int n) {
        return check(n, 1);
    }

    boolean check(int n, long value) {
        if (value >= n) return n == value;

        return check(n, value * 4);
    }
}


// class Solution {
//    public boolean isPowerOfFour(int n) {
//        if(n<=0) return false;
//        if((n&(n-1))!=0) return false;
//         return (n-1)%3==0;
//     }
// }
