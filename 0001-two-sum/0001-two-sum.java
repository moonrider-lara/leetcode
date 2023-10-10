class Solution {
  public int[] twoSum(int[] nums, int target) {
    int length = nums.length-1;
    for (int i = 0; i <= length; i++) {
      for (int k = i+1; k <= length; k++) {
        if(nums[i] + nums[k] == target){
          return new int[]{i,k};
        }
      }
    }
    return nums;
  }
}