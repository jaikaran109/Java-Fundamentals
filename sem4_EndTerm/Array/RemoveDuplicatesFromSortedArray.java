class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 1;
        while(r < n){
            if(nums[l] == nums[r]) r++;
            else nums[++l] = nums[r];
        }
        return l + 1;
    }
}
