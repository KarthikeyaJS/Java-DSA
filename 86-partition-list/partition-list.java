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
    public ListNode partition(ListNode head, int x) {
        ListNode less=new ListNode(0);
        ListNode great=new ListNode(0);
        ListNode curr=head;
        ListNode lessCurr=less;
        ListNode greatCurr=great;
        while(curr!=null){
            if(curr.val<x){
                lessCurr.next=new ListNode(curr.val);
                curr=curr.next;
                lessCurr=lessCurr.next;
            }
            else{
                greatCurr.next=new ListNode(curr.val);
                curr=curr.next;
                greatCurr=greatCurr.next;
            }
        }
        lessCurr.next=great.next;
        return less.next;
    }
}