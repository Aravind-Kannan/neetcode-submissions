class Solution {
    public int findMin(int[] nums) {
        int n = nums.length, l = 0, r = n - 1, min = nums[0];

        while(l <= r)
        {
            int mid = (l + r)/ 2;
            if(0 <= mid - 1 && mid - 1 < n && nums[mid - 1] > nums[mid])
            {
                min = Math.min(min, nums[mid]);
                break;
            } 
            min = Math.min(min, Math.min(nums[l], nums[r]));

            if(nums[mid] > nums[r])
            {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return min;
    }
}
