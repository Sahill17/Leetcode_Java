class Solution {
    public boolean detectCapitalUse(String word) {
       boolean match1 = true, match2 = true, match3 = true;
    
        int n = word.length();

        // case 1 : All capital
        for(int i = 0;i < n;i++){
            if(!Character.isUpperCase(word.charAt(i))){
                match1 = false;
                break;
            }
        }
        if(match1){
            return true;
        }

        // case 2 : All non-capitals
        for(int i = 0;i < n;i++){
            if(!Character.isLowerCase(word.charAt(i))){
                match2 = false;
                break;
            }
        }
        if(match2){
            return true;
        }

        // case 3 : First letter is capital
        if(!Character.isUpperCase(word.charAt(0))){
            match3 = false;
        }
        if(match3){
            for(int i = 1;i < n;i++){
                if(!Character.isLowerCase(word.charAt(i))){
                    match3 = false;
                    break;
                }
            }
        }
        if(match3){
            return true;
        }

        return false;
    }
}
