class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        for(int i = 0 ; i <= nums.length - k; i++){
            HashSet<Integer> set = new HashSet<>();
            long sum = 0;
            boolean distinct = true;
            for(int j = i ; j < i + k ; j++){
                if(set.contains(nums[j])){
                    distinct = false;
                    break;
                }
                set.add(nums[j]);
                sum += nums[j];
            }
            if(distinct) maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
