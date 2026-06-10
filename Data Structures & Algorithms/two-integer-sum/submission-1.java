class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num_ocurr = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(num_ocurr.containsKey(target - nums[i])) {
                result[0] = num_ocurr.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            num_ocurr.put(nums[i],i);
        }
        return result;  
    }
}
