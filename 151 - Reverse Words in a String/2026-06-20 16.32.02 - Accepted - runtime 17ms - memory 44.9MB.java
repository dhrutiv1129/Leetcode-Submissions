class Solution {
    public String reverseWords(String s) {
        
        

        String[] words = s.trim().split("\\s+");
        int left = 0;
        int right = words.length - 1;
       
        
        
        while(right > left){
            System.out.println(left);
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
         
           right -= 1;
           left += 1;
        }
     
        return String.join(" ", words);
    }
}