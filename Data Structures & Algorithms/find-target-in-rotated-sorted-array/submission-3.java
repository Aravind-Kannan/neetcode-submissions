class Solution {
    public int search(int[] nums, int target) {
        int split = 0, l = 0, r = nums.length - 1;

        while(l <= r)
        {
            split = (l + r) / 2;

            if(nums[split] < nums[r]) r = split;
            else l = split + 1;
        }

        l = 0; r = split -1;
        int mid = 0;

        while(l <= r)
        {
            mid = (l + r) / 2;
            if(nums[mid] == target) return mid;

            if(nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }

        l = split; r = nums.length - 1;

        while(l <= r)
        {
            mid = (l + r) / 2;
            if(nums[mid] == target) return mid;

            if(nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }

        return -1;
    }
}
