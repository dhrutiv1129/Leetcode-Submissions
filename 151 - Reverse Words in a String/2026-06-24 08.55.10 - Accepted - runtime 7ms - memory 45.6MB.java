class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
       
        String [] str = s.split(" ");
        int left = 0;
        int right = str.length - 1;
        while(right > left){
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left += 1;
            right -= 1;
          

        }
        return String.join(" ", str);
        
    }
}