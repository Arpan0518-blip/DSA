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

