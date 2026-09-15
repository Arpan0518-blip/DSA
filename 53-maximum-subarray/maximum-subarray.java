class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}






// ----------------------------------------------------------

// class Solution {
//     public int maxSubArray(int[] nums) {

//         int sum = nums[0];
//         int max = nums[0];

//         for (int i = 0; i < nums.length; i++) {

//             sum = Math.max(sum+nums[i],nums[i]);
//             sum = Math.max(max,sum);
            
//         }

//         return max;
//     }
// }

