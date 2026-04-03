class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--;  // adjust for 1-based index
            int rem = columnNumber % 26;
            s.append((char)(rem + 'A'));
            columnNumber = columnNumber / 26;
        }
        
        return s.reverse().toString();
    }
}