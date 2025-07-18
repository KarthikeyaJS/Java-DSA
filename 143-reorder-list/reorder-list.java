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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Stack<ListNode> stack=new Stack<>();
        ListNode curr=slow.next;
        slow.next=null;
        while(curr!=null){
            stack.push(curr);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null && !stack.isEmpty()){
            ListNode temp=curr.next;
            curr.next=stack.peek();
            stack.pop();
            curr.next.next=temp;
            curr=temp;
        }
    }
}