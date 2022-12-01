class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
    int index = -1;
        if(ruleKey.equals("type")){
            index = 0;
        }
        else if(ruleKey.equals("color")){
            index = 1;
        }
        else{
            index = 2;
        }
        
        int ans = 0;
        for(List<String> i : items){
            if(i.get(index).equals(ruleValue)){
                ans++;
            }
        }
        return ans;
    }
}
    
