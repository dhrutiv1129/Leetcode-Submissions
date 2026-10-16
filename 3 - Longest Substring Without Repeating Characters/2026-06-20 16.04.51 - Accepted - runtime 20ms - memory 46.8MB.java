class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int ans = 0;
        Set<Character> exists = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            while(exists.contains(s.charAt(right))){
                exists.remove(s.charAt(left));
                left += 1;
               
                
            }
            
            exists.add(s.charAt(right));

           
            ans = Math.max(ans, right - left + 1);
          
        }
    for (Character x : exists) {
        System.out.println(x);
    }
        
    return ans;
    }
}