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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy =new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode curr = head;
        while(curr != null){
            if(curr.val == val){
                pre.next = curr.next ;
                curr = curr.next;
                continue;

            }
            pre = pre.next;
            curr = curr.next;
        } 
        return dummy.next;
    }
}