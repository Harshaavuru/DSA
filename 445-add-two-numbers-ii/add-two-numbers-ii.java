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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { 
        Stack<Integer>empty=new Stack<>(); 
        Stack<Integer>empty2=new Stack<>();
        while(l1!=null){ 
            empty.push(l1.val); 
            l1=l1.next;
        }
        while(l2!=null){ 
            empty2.push(l2.val); 
            l2=l2.next;
        } 
        int carry=0; 
        ListNode temp=null; 
        while(!empty.isEmpty() || !empty2.isEmpty() || carry!=0){  
            int sum=carry;
            if(!empty.isEmpty()){ 
                sum+=empty.pop();
            }
            if(!empty2.isEmpty()){ 
                sum+=empty2.pop();
            }
            carry=sum/10; 
            int digit=sum%10; 
            ListNode node=new ListNode(digit); 
            node.next=temp;
            temp=node;
        }
        return temp;
    }
}
