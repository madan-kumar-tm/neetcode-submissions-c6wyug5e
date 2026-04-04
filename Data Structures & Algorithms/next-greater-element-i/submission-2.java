class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int temp = nums1[i];
            for(int j = 0; j < nums2.length; j++){
                if(nums2[j] == temp){
                    if(j+1 != nums2.length){
                        for(int k = j+1; k <= nums2.length;k++){
                            if(k == nums2.length) {
                                ans[i] = -1;
                            } 
                            else if(nums2[k] > nums2[j]) {
                                ans[i] = nums2[k];
                                break;
                            }   
                        }        
                    }
                    else ans[i] = -1;
                } 
            }
        }
        return ans;
    }
  
}
