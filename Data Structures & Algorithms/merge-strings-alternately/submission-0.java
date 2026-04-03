class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer s = new StringBuffer();
        int i = 0, j = 0;
        while(i < word1.length() || j < word2.length()){
            if(i < word1.length() && j < word2.length()){
                s.append(word1.charAt(i));
                i++;
                s.append(word2.charAt(j));
                j++;
                System.out.println(i+ " "+j);
            }
            else if(i == word1.length() && j < word2.length()){
                System.out.println(i+ " "+j);
                s.append(word2.charAt(j));
                j++;
            }
            else {
                System.out.println(i+ " "+j);
                s.append(word1.charAt(i));
                i++;
            }

        }
        String ans = s.toString();
        return ans;
    }
}