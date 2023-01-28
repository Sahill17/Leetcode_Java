class Solution {
    public boolean isPowerOfFour(int n) {
        return check(n, 1);
    }

    boolean check(int n, long value) {
        if (value >= n) return n == value;

        return check(n, value * 4);
    }
}
