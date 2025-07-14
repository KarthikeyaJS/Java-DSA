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
    // static int binToDec(String bin){
    //     int res=0;
    //     int pow=bin.length()-1;
    //     for(char ch:bin.toCharArray()){
    //         res+= (ch-'0')*(Math.pow(2,pow));
    //         pow--;
    //     }
    //     return res;
    // }
    public int getDecimalValue(ListNode head) {
        // StringBuilder sb=new StringBuilder();
        int num=0,power=1;
        ListNode curr=head;
        while(curr!=null ){
            num=num*2+curr.val;

            // sb.append(curr.val);
            curr=curr.next;
        }   
        // return binToDec(sb.toString());
        return num;
    }
}