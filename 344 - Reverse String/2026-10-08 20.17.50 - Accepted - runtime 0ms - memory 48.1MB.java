class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            Character temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left += 1;
            right -= 1;
        

        }

     
        
    }
}