class Solution {
    public int maxScore(String s) {
        int[] temp = new int[s.length()];
        for(int i = 0; i < temp.length; i++){
            temp[i] = (int)s.charAt(i) - 48;
        }
        int max = 0;
        for(int i = 0; i < temp.length - 1; i++){
            int half0 = 0;
            int half1 = 0;
            for(int j = 0; j < i+1; j++){
                if(temp[j]==0){
                    half0++;
                }
            }
            for(int j = i+1; j < temp.length; j++){
                if(temp[j]==1){
                    half1++;
                }
            }
            max = Math.max(half0+half1,max);
        }
        return max;
    }
}