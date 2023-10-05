class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int [] arr = new int[101];
        
        for(int i=0;i<logs.length;i++){
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }
        
        for(int i = 1;i<101;i++){
            arr[i] += arr[i-1];
        }
        
        int maxPopulation = 0;
        int year = 0;
        for(int i = 0;i<101;i++){
            if(arr[i] > maxPopulation){
                maxPopulation = arr[i];
                year = i + 1950;
            }
        }
        return year;
    }
}


//Brute Force approach :

//    //constraints 1 <= logs.length <= 100 and 1950 <= birthi < deathi <= 2050
//         //so max years we can  have is 2050 - 1950 = 100
//         //so create an array for storing population in given years
//         int[] arr = new int[101];
        
//         //first check logs
//         for(int i=0;i<logs.length;i++){
//             //checking only birthi to deathi(excluding)
//             for(int j =logs[i][0];j<logs[i][1];j++){
//                 //counting population
//                 arr[j-1950]++;
//             }
//         }
        
        
//         int maxPopulationYear = 0;
//         int maxPopulation = 0;
//         //now checking in arr 
//         for(int i = 0;i<101;i++){
//             //highest and earliest arr[i] will be our maximum population , and i wil be year 
//             if(maxPopulation < arr[i]){
//                 maxPopulation = arr[i];
//                 //max population year + 1950
//                 maxPopulationYear = i + 1950;
//             }
//         }
//         return maxPopulationYear;