class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        Arrays.sort(strs);
        String word1 = strs[0];
        String word2 = strs[strs.length - 1]; 

        int length = Math.min(word1.length(), word2.length());
        for(int i = 0; i < length && word1.charAt(i) == word2.charAt(i); i++){
            prefix = word1.substring(0, i + 1);
        }


        return prefix;
        
    }
}