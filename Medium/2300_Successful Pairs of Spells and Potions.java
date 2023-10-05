class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        // insertion sort to sort potions array
        // for(int i = 0; i < m-1; i++){
        //     for(int j = i+1;j > 0; j--){
        //         if(potions[j] < potions[j-1]){
        //             int temp = potions[j];
        //             potions[j] = potions[j-1];
        //             potions[j-1] = temp;
        //         }
        //         else {
        //             break;
        //         }
        //     }
        // }
        Arrays.sort(potions);
        int[] pairs = new int[n];
        int maxPotion = potions[m-1];
        for(int i = 0; i < n; i++){
            int spell = spells[i];
            long minPotion = (long) Math.ceil((1.0 * success) / spell);
            if(minPotion > maxPotion){
                pairs[i] = 0;
                continue;
            } 
            int index = bs(potions,(int) minPotion);
            pairs[i] = m - index;
        }
        return pairs;
    }

    private int bs(int[] a,int key){
        int min = 0;
        int high = a.length;
        while(min < high){
            int mid = min + (high - min) / 2;
            if(a[mid] < key){
                min = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return min;
    }
}

