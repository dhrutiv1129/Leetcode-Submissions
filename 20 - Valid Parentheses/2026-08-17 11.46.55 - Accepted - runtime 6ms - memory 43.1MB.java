class Solution {
    public boolean isValid(String s) {
      HashMap<Character, Character> pairs = new HashMap<>();

    pairs.put(')', '(');
    pairs.put('}', '{');
    pairs.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(pairs.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            } else if(pairs.containsKey(s.charAt(i))){
                if(stack.isEmpty() || stack.pop() != pairs.get(s.charAt(i))){
                    return false;
                }
            }

        }

        if(stack.isEmpty()){
            return true;
        }

        

       return false;
    }
}