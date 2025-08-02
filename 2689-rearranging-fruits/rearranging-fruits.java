class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        int n=basket1.length;
        int mini=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(basket1[i],map.getOrDefault(basket1[i],0)+1);
            mini=Math.min(mini,basket1[i]);
            map.put(basket2[i],map.getOrDefault(basket2[i],0)-1);
            mini=Math.min(mini,basket2[i]);
        }
        List<Integer> list=new ArrayList<>();
        for(var entry:map.entrySet()){
            int count=entry.getValue();
            if(count%2!=0)  return -1;
            for(int i=0;i<Math.abs(count)/2;i++){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        long res=0;
        for(int i=0;i<list.size()/2;i++){
            res+=Math.min(2*mini,list.get(i));
        }
        return res;

    }
}