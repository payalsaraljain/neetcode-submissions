class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            unique.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++) {
            int count = 1;
            if(unique.contains(nums[i] - 1)){
                int t = nums[i] - 1;
                while(unique.contains(t)) {
                    unique.remove(t);
                    count++;
                    t = t - 1;
                }
            }
            if(unique.contains(nums[i] + 1)) {
                int t = nums[i] + 1;
                while(unique.contains(t)) {
                    unique.remove(t);
                    count++;
                    t = t + 1;
                }
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
