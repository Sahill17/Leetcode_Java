class Solution {
    public void reverseString(char[] s) {
       int start = 0;
       int end = s.length - 1;
       doReverse(s,start,end);
    }

    static char[] doReverse(char[] arr,int start,int end){
        while(start <= end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}