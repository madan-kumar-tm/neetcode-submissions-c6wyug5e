class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sTemp = s.toCharArray();
        char[] tTemp = t.toCharArray();
        Arrays.sort(sTemp);
        Arrays.sort(tTemp);
        return Arrays.equals(sTemp,tTemp);

    }
}
