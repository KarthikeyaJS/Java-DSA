class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.add(entry);
            if(pq.size()>k) pq.poll();
        }
        // int n=map.size();
        int idx=0;
        while(!pq.isEmpty()){
            arr[idx++]=pq.poll().getKey();
        }
        return arr;
    }
}