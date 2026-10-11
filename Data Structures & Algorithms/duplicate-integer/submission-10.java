class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        Set<Integer> seen = new HashSet<>((int)(len / 0.75) + 1);
        for (int num : nums){
            if (!seen.add(num)){
                return true;
            }
        }
        return false;
}
}