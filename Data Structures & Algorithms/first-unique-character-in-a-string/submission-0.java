class Solution {
    public int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            int index = i;
            for(int j = 0; j < s.length(); j++){
                if(temp == s.charAt(j) && i !=j){
                    index = -1;
                    break;
                }
            }
            if(index != -1){
                return i;
            }
            
        }
        return -1;
        
    }
}