class Solution {
    public int maxDepth(String s) {
        int result = 0;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if( c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                stack.pop();
            }
            result = Math.max(result, stack.size());
        }
        return result;
    }
}