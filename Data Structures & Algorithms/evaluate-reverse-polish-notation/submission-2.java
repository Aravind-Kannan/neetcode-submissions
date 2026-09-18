class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String token: tokens) {
            if(token.equals("+"))
            {
                st.push(st.pop() + st.pop());
            } 
            else if(token.equals("-"))
            {
                int op1 = st.pop(), op2 = st.pop();
                st.push(op2 - op1);
            }
            else if(token.equals("*"))
            {
                st.push(st.pop() * st.pop());
            }
            else if(token.equals("/"))
            {
                int op1 = st.pop(), op2 = st.pop();
                st.push(op2 / op1);
            }
            else
            {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
}
