class Solution {
    public boolean isAnagram(String s, String t) {

        char[]sSorted = s.toCharArray();
        char[]tSorted = t.toCharArray();

        Arrays.sort(sSorted);
        Arrays.sort(tSorted);
        System.out.println(sSorted);
        System.out.println(tSorted);

        return Arrays.equals(sSorted, tSorted);
    }



        /*
        
        if(s.length() != t.length()){
            return false;
        }
        for(Character c:s.toCharArray()) {
            System.out.println(c);
            if(!t.contains(String.valueOf(c))){
                return false;
            }
            
         } 

        return true;

        */
        
    
}