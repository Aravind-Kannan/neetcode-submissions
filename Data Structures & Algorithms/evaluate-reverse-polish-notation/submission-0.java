class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack();
        Set<String> operators = Set.of("+", "-", "*", "/");

        for(String token: tokens)
        {
            if(operators.contains(token))
            {
                String op2 = stack.peek();
                stack.pop();
                String op1 = stack.peek();
                stack.pop();
                int res = 0;

                if(token.equals("+"))
                {
                    res = Integer.parseInt(op1) + Integer.parseInt(op2);
                } 
                else if(token.equals("-"))
                {
                    res = Integer.parseInt(op1) - Integer.parseInt(op2);
                }
                else if(token.equals("*"))
                {
                    res = Integer.parseInt(op1) * Integer.parseInt(op2);
                }
                else if(token.equals("/"))
                {
                    res = Integer.parseInt(op1) / Integer.parseInt(op2);
                }

                stack.push(Integer.toString(res)); 
            }
            else
            {
                stack.push(token);
            }
        }

        return Integer.parseInt(stack.peek()); 
    }
}
