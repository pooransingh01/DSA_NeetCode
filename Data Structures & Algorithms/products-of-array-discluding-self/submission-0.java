class Solution {
    public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] res = new int[n];
            int productbeforecurr = 1;
            int productaftercurr = 1;

            for (int i = 0; i < n; i++){
                res[i] = productbeforecurr;
                productbeforecurr *= nums[i];
            }

            for (int i = n - 1; i >= 0; i--){
                res[i] *= productaftercurr;
                productaftercurr *= nums[i];
            }

            return res;
    }
}