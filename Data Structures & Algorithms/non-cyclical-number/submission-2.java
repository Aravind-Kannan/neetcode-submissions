class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();

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
            System.out.println(sum);
            if(s.contains(sum)) return false;
            s.add(sum);
            n = sum;
        }
    }
}
