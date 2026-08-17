class Solution {
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        if(n == 0) return 1;

        double result = myPow(x, n / 2);

        result *= result;
        if(n < 0 && Math.abs(n) % 2 == 1) result *= 1/x;
        else if(n > 0 && n % 2 == 1) result *= x;

        return result;
    }
}
