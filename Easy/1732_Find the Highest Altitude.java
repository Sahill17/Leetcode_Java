class Solution {
    public int largestAltitude(int[] gain) {
        
        int highest_altitude = 0;
        int current_altitude = 0;
        
        for(int i = 0;i<gain.length;i++){
            current_altitude += gain[i];
            highest_altitude = Math.max(current_altitude,highest_altitude);
        }
        return highest_altitude;
    }
}
