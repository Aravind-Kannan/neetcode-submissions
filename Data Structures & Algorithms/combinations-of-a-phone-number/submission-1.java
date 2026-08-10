class Solution {
    Map<Integer, String> map = Map.of(2, "abc", 3, "def", 4, "ghi", 5, "jkl", 6, "mno", 7, "pqrs", 8, "tuv", 9, "wxyz");
    List<String> result = new ArrayList<>();

    void generate(String s, String digits, int i, int n)
    {
        if(i == n) {
            result.add(s);
            return;
        }

        String charString = map.get(digits.charAt(i) - '0');
        for(int j = 0; j < charString.length(); j++)
        {
            generate(s + charString.charAt(j), digits, i + 1, n);
        }
    }



    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();
        generate("", digits, 0, digits.length());

        return result;
    }
}
