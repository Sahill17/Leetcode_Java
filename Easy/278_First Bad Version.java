public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       int start = 1;
       int end = n;
       while(start < end){
           //until strat becomes gratee than end 
           int mid = start + (end - start) / 2;
           if(isBadVersion(mid)){
               //if mid is badVersion that we ingore all Versions after the mid, which makes mid an end point.
            end = mid;
           }
           else{
               //but if mid is not badVersion than we can consider mid as start but we already know that it's not badVersion so make it ' mid+1 ' 
               start = mid+1;
           }
       }
       //finally when start becomes greater than end then start is first badVersion we want
       return start;
    }
}