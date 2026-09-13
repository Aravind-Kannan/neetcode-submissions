class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length(), l = 0, r = n - 1;

        while(l < r)
        {
            while(l < n && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(r >= 0 && !Character.isLetterOrDigit(s.charAt(r))) r--;

            if(l < r && s.charAt(l) != s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
