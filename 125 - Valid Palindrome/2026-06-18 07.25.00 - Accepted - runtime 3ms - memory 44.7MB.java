class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        s = s.toLowerCase();
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right) && Character.isLetterOrDigit(s.charAt(left)) &&  Character.isLetterOrDigit(s.charAt(right))){
                return false;
            } else if(!Character.isLetterOrDigit(s.charAt(right))){
                right -= 1;
            } else if(!Character.isLetterOrDigit(s.charAt(left))){
                left += 1;
            } else{
                right -= 1;
                left += 1;
            }
        }
        return true;
    }
}