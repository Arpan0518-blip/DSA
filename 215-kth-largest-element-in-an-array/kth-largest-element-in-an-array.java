class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for(int i : nums){
            q.add(i);
            if(q.size()>k){
                q.remove();
            }
        }
        return q.peek();
        
    }
}