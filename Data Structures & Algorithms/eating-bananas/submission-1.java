class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0, mid = 0;

        for(int i = 0; i < piles.length; i++)
        {
            r = Math.max(r, piles[i]);
        }

        int ans = r;

        while(l <= r)
        {
            mid = (l + r) / 2;

            int hours = 0;
            for(int i = 0; i < piles.length; i++)
            {
                if(piles[i] % mid != 0) hours += 1;
                hours += piles[i] / mid;
            }

            if(hours > h) {
                l = mid + 1;
            } else {
                r = mid - 1;
                ans = Math.min(ans, mid);
            }
        }

        return ans;
    }
}
