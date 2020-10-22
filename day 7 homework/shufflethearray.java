class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int start=0 ;
        int mid=n;
        int result[]= new int[2*n];
        
        for(int i=0; i<2*n; i=i+2)
        { 
            int new_mid =mid++;
            int new_start =start++;
            result[i] = nums[new_start];
            result[i+1] = nums[new_mid];
        }
        return result;
        
    }
}