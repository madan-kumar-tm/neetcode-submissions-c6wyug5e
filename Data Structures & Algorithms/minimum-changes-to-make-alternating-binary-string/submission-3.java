class Solution {
    public int minOperations(String s) {
        int len = 0;
        int i = 1;
        char temp = s.charAt(0);
        while(i < s.length()){
            
            if(temp == '0' && s.charAt(i) == temp){
                i++;
                len++;
                temp = '1';
            }
            else if(temp == '1' && s.charAt(i) == temp){
                i++;
                len++;
                temp = '0';
            }
            else if(temp == '0' && s.charAt(i) != temp){
                i++;
                temp = '1';
            }
            else{
                i++;
                temp = '0';
            }
        }
        if(len > s.length()/2){
            return (s.length()-len);
        }
        else{
            return len;
        }    
    }
}