// class Solution {
//     public int[] sortArray(int[] nums) {
//         int n = nums.length;

//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {

//                 if (nums[j] > nums[j + 1]) {

//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                 }
//             }
//         }

//         return nums;
//     }
// }



// --------------------------------------------------

// import java.util.Arrays;

// class Solution {
//     public int[] sortArray(int[] nums) {
//         Arrays.sort(nums);
//         return nums;
//     }
// }





// ----------------------------------------------------------------------------

class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }

    public void divide(int[] nums, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;

        divide(nums, left, mid);
        divide(nums, mid + 1, right);

        conquer(nums, left, mid, right);
    }

    public void conquer(int[] nums, int left, int mid, int right) {
        int n = right - left + 1;
        int[] arr = new int[n];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                arr[k] = nums[i];
                i++;
            } 
            else {
                arr[k] = nums[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            arr[k] = nums[i];
            i++;
            k++;
        }

        while (j <= right) {
            arr[k] = nums[j];
            j++;
            k++;
        }

        for (k = 0; k < n; k++) {
            nums[left + k] = arr[k];
        }
    }
}

