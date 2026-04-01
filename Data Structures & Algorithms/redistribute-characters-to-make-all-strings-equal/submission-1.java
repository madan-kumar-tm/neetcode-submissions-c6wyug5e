class Solution {
    public boolean makeEqual(String[] words) {
        int[] hash = new int[26];
        //int xor1 = 0;
        for(int i = 0; i < words.length; i++){
            String temp = words[i];
            for(int j = 0; j < temp.length(); j++){
                char t = temp.charAt(j);
                int index = t - 'a';
                //System.out.println(index);
                hash[index]++;
                //xor1 ^= t;
            }
        }
        int n = words.length;

        // Check divisibility
        for (int count : hash) {
            if (count % n != 0) {
                return false;
            }
        }

        return true;
    }
}        