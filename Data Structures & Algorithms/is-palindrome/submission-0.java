class Solution {
    boolean checkValid(char c)
    {
        return ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }

    char toLowerCase(char c)
    {
        if(c >= 'A' && c <= 'Z') return (char)(c - 'A' + 'a');
        return c;
    }

    public boolean isPalindrome(String s) {
        int n = s.length();
        int f = 0, b = n - 1;
        char[] arr = s.toCharArray();

        while(f < b)
        {
            while(f < n && !checkValid(toLowerCase(arr[f]))) { f++; }
            while(b >= 0 && !checkValid(toLowerCase(arr[b]))) { b--; }

            if(f > n || b < 0) break;

            if(toLowerCase(arr[f]) != toLowerCase(arr[b])) return false;
            f++;
            b--;
        } 

        return true;
    }
}
