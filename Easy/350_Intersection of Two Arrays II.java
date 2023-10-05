class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        // to keep the number how many times a element is coming in array we'll  use HashMap.
        HashMap<Integer,Integer> Map = new HashMap<Integer,Integer>();

        // to keep track of our answer will be storing intersection elements in ArrayList
        ArrayList<Integer> ans = new ArrayList<>();

        // first iterate through first array and put all elements in Map with their number of  occurrences in the array
        for(int i : nums1){
            // if the element is already available in Map then just incerese it's  occurrence count (value, as we consider element as a Key)
            if(Map.containsKey(i)){
                Map.put(i,Map.get(i)+1);
            }
            // but if element is coming for the first time then just put it in Map with occurrence count (value) one.
            else{
                Map.put(i,1);
            }
        }

        // now let's check in the second array for same elements 
        for(int i : nums2){
            // nums1's elements are alreday in Map with their occurrence count, just need to check if nums2 has any element which is already available in Map
            // (so we can keep track that that element is counted for 1 time and put it in ArrayList, 
            // that's why we are checking thet it's count is greater than 0 or not beacuse if not that means nums1 have less occurrence of that element )

            // if element is already available in Map and it's occurrence value is greater than 0 then we'll minus it occurrence vale by one 
            if(Map.containsKey(i) && Map.get(i) > 0){
                Map.put(i,Map.get(i) - 1);
                // add that element in ArrayList
                ans.add(i);
            }
        }

        // we need to return array for answer so create one and give size of ArrayList to it
        int [] arr = new int[ans.size()];

        // now just put all elements of ArrayList in Array and return it
        for(int i = 0;i<arr.length;i++){
            arr[i] = ans.get(i);
        }

        return arr;
    }
}