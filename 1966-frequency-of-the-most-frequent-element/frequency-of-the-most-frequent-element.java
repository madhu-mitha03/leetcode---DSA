class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int max = 0;
          long sum = 0;
          int i = 0;

        for(int j = i; j < nums.length; j++){
            sum = sum + nums[j];

            while((long)nums[j] * (j-i+1) - sum > k){
                sum = sum - nums[i];
                i++;
            }
           max = Math.max(max, j -i + 1);
        }
        return max;
    }
}
