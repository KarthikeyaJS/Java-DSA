class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones)   pq.add(i);

        while(pq.size()>1){
            int s1=pq.poll();
            int s2=pq.poll();
            int r=s1-s2;
            if(r!=0)    pq.add(r); 
        }
        if(pq.size()==0)    return 0;
        return pq.peek();
    }
}