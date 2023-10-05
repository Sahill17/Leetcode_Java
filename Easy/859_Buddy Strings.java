class Solution {
    public boolean buddyStrings(String s, String goal) {
        // if(s.length() != goal.length()){
        //     return false;
        // }
        if(s.equals(goal)){
            Set<Character> temp = new HashSet<>();
            for( char c : s.toCharArray()){
                temp.add(c);
            }
            return temp.size() < goal.length();
        }
        int i = 0;
        int j = s.length() - 1;
        
        while(i < j && s.charAt(i) == goal.charAt(i)){
            i++;
        }
        while(j >= 0 && s.charAt(j) == goal.charAt(j)){
            j--;
        }
        if(i < j){
            char[] arr = s.toCharArray();
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            s = new String(arr);
        }
        return s.equals(goal);
    }
}