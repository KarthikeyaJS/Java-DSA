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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode n1=list1;
        ListNode n2=list1;
        a--;
        while(a>0){
            n1=n1.next;
            n2=n2.next;
            b--;
            a--;

        }      

        while(b>0){
            n2=n2.next;
            b--;
        }
        n1.next=list2;
        ListNode n3=list2;
        while(n3.next!=null) n3=n3.next;
        n3.next=n2.next;
        n2.next=null;
        // System.out.println(n1.val+""+n2.val);
        return list1;
    }
}