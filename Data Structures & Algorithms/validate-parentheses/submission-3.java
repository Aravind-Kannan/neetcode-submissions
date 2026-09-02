class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('}','{');
        pairs.put(')','(');
        pairs.put(']','[');

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++)
        {
            if(pairs.containsKey(s.charAt(i)))
            {
                if(st.size() == 0 || pairs.get(s.charAt(i)) != st.peek())
                {   
                    return false;
                } 
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        return st.size() == 0;
    }
}
