class Solution {
    Set<Integer> seen = new HashSet<>(); 

    public boolean isHappy(int n) {
        if(n == 1) return true;

        seen.add(n);

        int nextN = 0;
        while(n > 0) {
            int r = n % 10;
            nextN += r * r;
            n /= 10;
        }

        if(seen.contains(nextN)) {
            return false;
        }

        return isHappy(nextN);
    }
}
