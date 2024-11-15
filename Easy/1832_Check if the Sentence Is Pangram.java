class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        else{
            String str = "abcdefghijklmnopqrstuvwxyz";
            for(int i=0;i < str.length();i++){
                if(sentence.indexOf(str.charAt(i)) == -1){
                    return false;
                }
            }
            return true;
        }
        
    }
}

// Python

/*
class Solution(object):
    def checkIfPangram(self, sentence):
        """
        :type sentence: str
        :rtype: bool
        """
        if(len(sentence) < 26):
            return False
        else:
            return set("abcdefghijklmnopqrstuvwxyz").issubset(set(sentence))
 */