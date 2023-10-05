class Solution {
   public int reverse(int x) {
	if (x == 0) return x;
	int rev = 0;
	while (x != 0) {
		int digit = x % 10;
		x /= 10;
		// check if rev is greater than max_value and less than min_value
        // rev * 10 > max_value should not 
        // rev * 10 < min_value should not 
        // min = -2147483648
        // max = 2147483647
        if((rev > Integer.MAX_VALUE / 10) || (rev == Integer.MAX_VALUE / 10 && digit > 7) || (rev < Integer.MIN_VALUE / 10) || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
		rev = rev * 10 + digit;
	}
	return rev;
}
}
