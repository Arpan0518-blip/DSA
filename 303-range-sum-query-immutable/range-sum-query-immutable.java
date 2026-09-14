// public class main{ 
 
class NumArray { 
    int [] pref; 
 
    public NumArray(int[] nums) { 
        int n = nums.length; 
        pref = new int[n]; 
         
        pref[0] = nums[0]; 
        for(int i = 1; i < n ; i++){ 
            pref[i] = pref[i-1] + nums[i]; 
        } 
    } 
     
    public int sumRange(int left, int right) { 
 
        if (left == 0) { 
            return pref[right]; 
        } 
 
        return pref[right] - pref[left - 1]; 
         
    } 
 
} 


// public static void main(String[]args){ 
//     int[] nums = {-2, 0, 3, -5, 2, -1}; 
 
//     NumArray obj = new NumArray(nums); 
 
//     // System.out.println(obj.sumRange(0, 2)); 
//     // System.out.println(obj.sumRange(2, 5)); 
//     // System.out.println(obj.sumRange(0, 5)); 
// } 








// ------------------------------------------------------------

// public class Main {

//     static int[] pref;

//     static void prefixSum(int[] nums, int left, int right) {

//         int n = nums.length;

//         pref = new int[n];

//         pref[0] = nums[0];

//         for (int i = 1; i < n; i++) {
//             pref[i] = pref[i - 1] + nums[i];
//         }


//         if (left == 0) {
//             System.out.println(pref[right]);
//         } 
//         else {
//             System.out.println(pref[right] - pref[left - 1]);
//         }
//     }

//     public static void main(String[] args) {

//         int[] nums = {-2, 0, 3, -5, 2, -1};

//         prefixSum(nums, 0, 2);
//         prefixSum(nums, 2, 5);
//         prefixSum(nums, 0, 5);
//     }
// }