class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] hash = new int[grid.length*grid.length + 1];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                hash[grid[i][j]]++;
            }
        }
        int[] ans  = new int[2];
        for(int i = 1; i < hash.length; i++){
            if(hash[i] > 1){
                ans[0] = i;
            }
            else if(hash[i] == 0){
                ans[1] = i;
            }
        }
        return ans;
    }
}