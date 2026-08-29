class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = piles[0];

        for(int i = 0; i < piles.length; i++)
        {
            r = Math.max(r, piles[i]);
        }

        int mid = (l + r) / 2, res = 0; 

        while(l <= r)
        {
            mid = (l + r) / 2; 
            int hours = 0;
            for(int i = 0; i < piles.length; i++)
            {
                hours += Math.ceil(1.0 * piles[i]/mid);
            }
            System.out.println(l + " " + r + " " + mid);
            System.out.println(hours);
            if(hours > h) {
                l = mid + 1;
            } else {
                res = mid;
                r = mid - 1;
            }
        }

        return res;
    }
}
