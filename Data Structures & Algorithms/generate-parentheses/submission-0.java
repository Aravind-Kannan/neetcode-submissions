class Solution {
    List<String> result = new ArrayList<>();

    void generate(String s, int open, int close, int n)
    {
        if(s.length() == 2 * n)
        {
            result.add(s); return;
        }

        if(open < n)
        {
            generate(s + "(", open + 1, close, n);
        }

        if(close < open)
        {
            generate(s + ")", open, close + 1, n);
        }
    }

    public List<String> generateParenthesis(int n) {
        generate("", 0, 0, n);
        return result;
    }
}
