class Solution {
    public boolean isPalindrome(int x) {
       
        String reversed = new StringBuilder(String.valueOf(x)).reverse().toString();
        return reversed.equals(String.valueOf(x));
        
    }
}