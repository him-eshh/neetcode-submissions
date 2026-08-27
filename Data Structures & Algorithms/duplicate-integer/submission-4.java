class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicateSet = new HashSet<>();
        for(int x: nums){
            if (duplicateSet.contains(x)){
                return true;
            }
            duplicateSet.add(x);

        }
        return false;
    }
}