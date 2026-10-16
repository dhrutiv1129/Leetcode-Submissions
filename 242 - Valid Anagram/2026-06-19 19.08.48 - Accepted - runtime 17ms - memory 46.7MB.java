class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> tCount = new HashMap();
        for(char c: t.toCharArray()){
            if(!tCount.containsKey(c)){
                tCount.put(c, 1);
            } else{
                tCount.put(c, tCount.get(c) + 1);
            }

        }
        for(char i : s.toCharArray()){
            if(tCount.containsKey(i) && tCount.get(i) > 0){
                tCount.put(i, tCount.get(i) - 1);
            } else {
                return false;
            }
        }
        for (int value : tCount.values()) {
            if (value != 0) {
                return false;
            }
        }


        return true;
        
    }
}