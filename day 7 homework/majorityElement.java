class Solution {
    public int majorityElement(int[] nums) {
        
        int mj = 0, cnt = 1;
        int i;
        for (i = 1; i < nums.length; i++) {
            if (nums[mj] == nums[i])
                cnt++;
            else
                cnt--;
            if (cnt == 0) {
                mj = i;
                cnt = 1;
            }
        }
        return nums[mj];
        
    }
}