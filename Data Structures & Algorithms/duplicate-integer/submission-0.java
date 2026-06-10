class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> freq= new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if (!freq.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}