/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode p1 = head;
        ListNode p2 = prev;
        int maxsum = 0;
        while(p2 != null){
            int sum = p1.val + p2.val;
            maxsum = Math.max(maxsum, sum);
            p1 = p1.next;
            p2 = p2.next; 

        }
        return maxsum;
        
    }
}