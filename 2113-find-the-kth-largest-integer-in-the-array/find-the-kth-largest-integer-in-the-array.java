import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq=new PriorityQueue<>();
        for(String i:nums){
            BigInteger big=new BigInteger(i);
            if(pq.size()==k){
                if(pq.peek().compareTo(big)<0){
                    pq.poll();
                    pq.add(big);
                }
            }
            else{
                pq.add(big);
            }
        }
        return pq.peek().toString();
    }
}