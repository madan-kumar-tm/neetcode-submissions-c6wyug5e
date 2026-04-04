class Solution {
    public int appendCharacters(String s, String t) {
        int sPnt = 0, tPnt = 0, r = 0;
        while(tPnt < t.length()){
            if(sPnt == s.length()){
                r++;
                tPnt++;
            }
            else if(s.charAt(sPnt) == t.charAt(tPnt)){
                tPnt++;
                sPnt++;
            }
            else{
                sPnt++;
            }    
        }
        return r;   
    }
}