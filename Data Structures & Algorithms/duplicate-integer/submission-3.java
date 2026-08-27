class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicateSet = new HashSet<>();
        for(int x: nums){
            if (!duplicateSet.add(x)){
                return true;
            }

        }
        return false;
    }
}