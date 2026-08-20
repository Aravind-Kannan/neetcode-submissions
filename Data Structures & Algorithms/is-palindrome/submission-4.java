class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        s = s.toLowerCase();
        while(l <= r)
        {
            while(!Character.isLetterOrDigit(s.charAt(l)) && l < s.length() - 1) l++;
            while(!Character.isLetterOrDigit(s.charAt(r)) && r > 0) r--;

            if(l <= r && s.charAt(l) != s.charAt(r))
            {
                return false;
            } else {
                l++; r--;
            }
        }

        return true;
    }
}
