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
    static ListNode revList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static ListNode getKNode(ListNode curr,int k){
        int count=0;
        while(curr!=null &&count<k){
            count++;
            curr=curr.next;
        }
        return curr;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        dummy.next=head;

        while(curr!=null){
            ListNode start=curr;
            ListNode kNode=getKNode(curr,k);
            if(kNode==null)     break;
            ListNode end=kNode.next;

            kNode.next=null;
            ListNode revHead=revList(start.next);
            ListNode revTail=start.next;

            start.next=revHead;
            revTail.next=end;
            curr=revTail;
        }
        return dummy.next;
    }
}