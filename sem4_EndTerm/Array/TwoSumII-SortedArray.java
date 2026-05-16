class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x = 0;
        int y = nums.length - 1;
        while(x < y){
            int sum = nums[x] + nums[y];
            if(sum == target) return new int[]{x+1,y+1};
            if(sum < target) x++;
            else y--;
        }
        return new int[]{-1,-1};
    }
}
