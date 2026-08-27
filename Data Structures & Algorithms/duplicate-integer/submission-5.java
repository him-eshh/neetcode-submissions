class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int x = 1; x < nums.length; x++){
            if (nums[x - 1] == nums[x]){
                return true;
            }
        }
        return false;
}
}