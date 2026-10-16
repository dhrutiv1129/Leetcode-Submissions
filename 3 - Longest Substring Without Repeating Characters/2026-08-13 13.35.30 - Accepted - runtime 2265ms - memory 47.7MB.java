class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        Set<Character> window = new HashSet<>();
        int runningLength = 0;
        for(int right = 0; right < s.length(); right++){
            while(window.contains(s.charAt(right))){
                window.remove(s.charAt(left));
                left ++;
            }
            
            window.add(s.charAt(right));
            runningLength = Math.max(runningLength, right - left + 1);
            System.out.println(runningLength);
            
        }

        return runningLength;
    }
}