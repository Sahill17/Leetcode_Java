public class Solution extends GuessGame {
    public int guessNumber(int n) {
       int start = 1;
       int end = n;
       int mid = n;
       while(guess(mid) != 0){
           mid = start + (end - start) / 2;
           if(guess(mid) == 1){
               start = mid + 1;
           }
           else{
               end = mid - 1;
           }        
       }  
       return mid;
    // return bs(1,n);
    }
    public int bs(int low,int high){
        int mid = low + (high - low) / 2;
        if(guess(mid) == 0){
            return mid;
        }
        else if(guess(mid) == 1){
            return bs(mid+1,high);
        }
        else{
            return bs(low,mid-1);
        }
    }
}