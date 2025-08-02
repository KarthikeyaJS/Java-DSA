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
    static ListNode revRec(ListNode prev,ListNode curr){
        if(curr==null)  return prev;
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        return revRec(prev,temp);
    } 
    static ListNode revList(ListNode head){
        return revRec(null,head);
    }
    public ListNode removeNodes(ListNode head) {
        head=revList(head);
        ListNode prev=head;
        ListNode curr=head.next;
        int maxi=head.val;
        while(curr!=null){
            if(curr.val<maxi){
                prev.next=curr.next;
            }
            else{
                maxi=curr.val;
                prev=curr;
            }
            curr=prev.next;
        }
        return revList(head);
    }
}