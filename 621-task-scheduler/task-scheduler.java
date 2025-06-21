class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxi=0;
        int maxCount=0;
        int total=tasks.length;
        for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxi=Math.max(maxi,map.get(ch));
        }
        for(int i:map.values()){
            if(maxi==i)    maxCount++;
        }
        return Math.max(total,(maxi-1)*(n+1)+maxCount );
    }
}