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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>empty=new ArrayList<>(); 
        for(ListNode head:lists){ 
            ListNode temp=head; 
            while(temp!=null){ 
                empty.add(temp.val); 
                temp=temp.next;
            }
        } 
        Collections.sort(empty); 
        ListNode dummy=new ListNode(0); 
        ListNode cur=dummy; 
        for(int x:empty){ 
            cur.next=new ListNode(x); 
            cur=cur.next;
        } 
        return dummy.next; 
    }
}