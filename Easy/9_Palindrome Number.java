class Solution {
    public boolean isPalindrome(int x) {
        // Follow up: Could you solve it without converting the integer to a string?
        int rev = 0;
        int temp = x; 
        if(x < 0 || (x != 0 && x % 10 == 0)){
            return false;
        }
        while(x != 0){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev==temp;
    }
}