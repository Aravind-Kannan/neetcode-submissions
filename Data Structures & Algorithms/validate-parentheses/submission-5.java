class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> m = new HashMap<>();
        m.put('}', '{');
        m.put(']', '[');
        m.put(')', '(');

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++)
        {
            Character c = s.charAt(i);
            if(m.values().contains(c))
            {
                st.push(c);
            }

            if(m.keySet().contains(c))
            {
                if(st.empty() || m.get(c) != st.peek()) {
                    return false;
                }
                st.pop();
            }
        }

        return st.size() == 0;
    }
}
