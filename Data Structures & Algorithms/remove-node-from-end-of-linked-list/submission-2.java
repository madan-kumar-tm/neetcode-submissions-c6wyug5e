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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode t1 = head;
        int len = 0;

        // Step 1: Find length
        while(t1 != null){
            len++;
            t1 = t1.next;
        }

        // Step 2: If deleting head
        if(n == len){
            return head.next;
        }

        // Step 3: Find (len - n - 1)th node
        int k = 0;
        while(temp != null){
            if(k == len - n - 1){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            k++;
        }

        return head;
    }
}
