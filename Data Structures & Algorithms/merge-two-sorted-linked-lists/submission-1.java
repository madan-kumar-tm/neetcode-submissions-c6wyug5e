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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        List<Integer> temp = new ArrayList<>();
        if(list1 == null && list2 == null) return null;
        while(temp1 != null || temp2 != null){
            if(temp1 != null){
                temp.add(temp1.val);
                temp1 = temp1.next;
            }
            if(temp2 != null){
                temp.add(temp2.val);
                temp2 = temp2.next;
            }
        }
        Collections.sort(temp);
        ListNode newHead = new ListNode(temp.get(0));
        ListNode t = newHead;
        int i = 1;
        while(i < temp.size()){
            ListNode t1 = new ListNode(temp.get(i));
            t.next = t1;
            t = t1;
            i++;
        }
        return newHead;
    }
}