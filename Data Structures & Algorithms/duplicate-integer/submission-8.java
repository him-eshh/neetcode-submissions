class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int x = 1; x <= nums.length -1; x++){
            if (nums[x - 1] == nums[x]){
                return true;
            }
        }
        return false;
}
}