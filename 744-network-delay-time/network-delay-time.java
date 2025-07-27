class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,List<int[]>> graph=new  HashMap<>();
        for(int i=1;i<=n;i++){
            graph.put(i,new ArrayList<>());
        }   
        for(int[] time:times){
            graph.get(time[0]).add(new int[]{time[1],time[2]});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.offer(new int[]{k,0});
        Map<Integer,Integer> map=new HashMap<>();

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int node=curr[0];
            int time=curr[1];
            if(map.containsKey(node))   continue;
            map.put(node,time);

            for(int[] neighbor:graph.get(node)){
                int nextNode=neighbor[0];
                int nextTime=neighbor[1];
                if(!map.containsKey(nextNode)){
                    pq.offer(new int[]{nextNode,time+nextTime});
                }
            }
        }
        if(map.size()!=n)   return -1;
        return Collections.max(map.values());
    }
}