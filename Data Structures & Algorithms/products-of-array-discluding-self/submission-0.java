class Solution {
    public int[] productExceptSelf(int[] nums) {
               int[] prefix_mul_b = new int[nums.length];
        int[] prefix_mul_a = new int[nums.length];

        //Time complexity O(n) but space complexity also O(n)
        for(int i = 0; i < nums.length; i++) {
            prefix_mul_b[i] = 1;
            prefix_mul_a[i] = 1;
        }

        int i = 0;
        int j = nums.length - 1;
        while(i < nums.length && j >= 0) {
            if(i == 0) {
                prefix_mul_b[i] = nums[i];
                prefix_mul_a[i] = nums[j];
            }
            else {
                prefix_mul_b[i] = prefix_mul_b[i-1] *  nums[i];
                prefix_mul_a[i] = prefix_mul_a[i-1] * nums[j];
            }
            i++;
            j--; 
        }

        int[] result = new int[nums.length];

        for(int k = 0; k < nums.length; k++) {
            if(k == 0) {
                result[k] = prefix_mul_a[nums.length - 1 - (k + 1)];
            }
            else if(k == nums.length - 1) {
                result[k] = prefix_mul_b[k - 1];
            }
            else{
                result[k] = prefix_mul_b[k-1] * prefix_mul_a[nums.length - 1 - (k + 1)];
            }
        }
        return result; 
    }
}  
