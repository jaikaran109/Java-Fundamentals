class Solution {
    public void moveZeroes(int[] nums) {
        int nonzeroes = 0;
        for(int  i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[nonzeroes] = nums[i];
                nonzeroes++;
            }
        }
        for(int i = nonzeroes ; i < nums.length ; i++){
            nums[i] = 0;
        }
    }
}
