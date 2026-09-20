class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h = new HashSet<>();
        h.add(n);

        while(true)
        {
            int sum = 0;
            while(n > 0)
            {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if(sum == 1) return true;
            if(h.contains(sum))
            {
                return false;
            }
            h.add(sum);
            // System.out.println(sum);
            n = sum;
        }
    }
}
