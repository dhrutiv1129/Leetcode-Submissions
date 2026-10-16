class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> patternToS = new HashMap<>();
        HashMap<String, Character> sToPattern = new HashMap<>();
        String[]str = s.split(" ");
        for(String i: str){
            System.out.println(i);
        }
        System.out.println(str.length);
        System.out.println(pattern.length());

     
        if(pattern.length() != str.length){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            if(patternToS.containsKey(pattern.charAt(i)) && !patternToS.get(pattern.charAt(i)).equals(str[i])){
                System.out.println(pattern.charAt(i));
                System.out.println(patternToS.get(pattern.charAt(i)));
                System.out.println(str[i]);


                return false;
            }
            if(sToPattern.containsKey(str[i]) && sToPattern.get(str[i]) != pattern.charAt(i)){
                return false;
            }
            patternToS.put(pattern.charAt(i),str[i]);
            sToPattern.put(str[i], pattern.charAt(i));
        }
        return true;
        
    }
}