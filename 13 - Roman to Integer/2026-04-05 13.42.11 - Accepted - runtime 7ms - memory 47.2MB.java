class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> conversions = new HashMap<>();
        conversions.put("I", 1);
        conversions.put("V", 5);
        conversions.put("X", 10);
        conversions.put("L", 50);
        conversions.put("C", 100);
        conversions.put("D", 500);
        conversions.put("M", 1000);
        conversions.put("IV", 4);
        conversions.put("IX", 9);
        conversions.put("XL", 40);
        conversions.put("XC", 90);
        conversions.put("CD", 400);
        conversions.put("CM", 900);

        

        int num = 0;
         while (!s.isEmpty()) {
            // Check for subtractive pair first
            if (s.length() >= 2 && conversions.containsKey(s.substring(0, 2))) {
                num += conversions.get(s.substring(0, 2));
                s = s.substring(2); // Remove the first two characters
            } else {
                num += conversions.get(s.substring(0, 1));
                s = s.substring(1); // Remove the first character
            }
        }
        return num;
        
    }
}