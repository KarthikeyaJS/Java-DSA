class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int maxi=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int x=entry.getKey();
            int y=entry.getValue();
            if(x==y){
                maxi=Math.max(maxi,x);
            }
        }
        return maxi;
    }
}