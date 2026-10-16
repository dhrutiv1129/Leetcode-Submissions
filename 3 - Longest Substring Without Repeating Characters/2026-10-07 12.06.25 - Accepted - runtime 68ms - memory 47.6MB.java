class Solution {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int runningLength = 0;
        for(int right = 0; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left += 1;

            }
            
            set.add(s.charAt(right));
            runningLength = Math.max(runningLength, right - left + 1);

        }
        return runningLength;
    }
}