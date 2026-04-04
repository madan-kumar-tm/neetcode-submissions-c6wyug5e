class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPnt = 0, tPnt = 0;
        while(tPnt < t.length()){
            if(sPnt >= s.length() - 1){
                return true;
            }
            else if(s.charAt(sPnt) == t.charAt(tPnt)){
                sPnt++;
                tPnt++;
            }
            else{
                tPnt++;
            }
        }
        return false;
    }
}