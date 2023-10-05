class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
      int BitonicIndex = findBitonicIndex(mountainArr);
      int MinimumIndex = OABinarySearch(mountainArr,target,0,BitonicIndex);
      if(MinimumIndex != -1){
          return MinimumIndex;
      }
      return OABinarySearch(mountainArr,target,BitonicIndex+1,mountainArr.length()-1);
    }

    int findBitonicIndex(MountainArray arr){
        int start = 0;
        int end = arr.length() - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr.get(mid) > arr.get(mid+1)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }

    int OABinarySearch(MountainArray arr,int target,int start,int end){
        boolean isAsc = arr.get(start) < arr.get(end);
       
            while (start <= end){
           int mid = start + (end - start) / 2;

           if(target == arr.get(mid)){
               return  mid;
           }

           if (isAsc){
               if(target < arr.get(mid)){
                   end = mid - 1;
               }
               else {
                   start = mid + 1;
               }
           }
           else {
               if(target > arr.get(mid)){
                   end = mid - 1;
               }
               else {
                   start = mid + 1;
               }
           }
       
    }
    return  -1;
        }
}
