class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            Character cs = s.charAt(i);
            map.put(cs, map.getOrDefault(cs, 0) + 1);
        }

        for(int j = 0; j < t.length(); j++){
            Character ct = t.charAt(j);
            if(!map.containsKey(ct) || map.get(ct) == 0){
                return false;
            } 
                map.put(ct, map.get(ct) - 1);
            

            }
            return true;
        }
        
    
}