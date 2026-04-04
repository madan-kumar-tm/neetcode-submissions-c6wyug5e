class Solution {
    public int appendCharacters(String s, String t) {
        int sPnt = 0, tPnt = 0;
        while(tPnt  < t.length() && sPnt < s.length()){
            if(s.charAt(sPnt) == t.charAt(tPnt)){
                tPnt++;
            }
            sPnt++;
        }
        return t.length() - tPnt;
    }
}