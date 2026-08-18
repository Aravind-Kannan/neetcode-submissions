class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        int[] result = new int[n];
        int carry = 1;
        for(int i = n - 1; i >= 0; i--)
        {
            result[i] = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
        }

        if(carry > 0)
        {
            int[] resultNew = new int[n + 1];
            for(int i = n; i > 0; i--)
            {
                resultNew[i] = result[i - 1];
            }
            resultNew[0] = carry;
            return resultNew;
        }

        return result;
    }
}
