class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mag = new HashMap();
        for(char c : magazine.toCharArray()){
            mag.put(c, mag.getOrDefault(c, 0) + 1);
        }
        for(char i : ransomNote.toCharArray()){
            if(mag.containsKey(i) && mag.get(i) > 0){
                mag.put(i, mag.get(i) - 1);
            } else{
                return false;
            }
        }
        return true;
    }
}