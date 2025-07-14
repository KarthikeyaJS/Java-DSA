class Node{
    int val;
    Node prev;
    Node next;
    Node(int val){
        this.val=val;
    }
    static int func(int n,int k){
        Node head =new Node(1);
        Node prev=head;
        for(int i=2;i<=n;i++){
            Node curr=new Node(i);
            curr.prev=prev;
            prev.next=curr;
            prev=curr;
        }
        head.prev=prev;
        prev.next=head;
        Node curr=head;
        while(curr.next!=curr){
            for(int i=1;i<k;i++){
                curr=curr.next;
            }
            curr.prev.next=curr.next;
            curr.next.prev=curr.prev;
            curr=curr.next;
        }
        return curr.val;

    }
}
class Solution {
    public int findTheWinner(int n, int k) {
        // LinkedList<Integer> llist=new LinkedList<>();
        return Node.func(n,k);

    }
}