class Solution {
    public int findLucky(int[] arr) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int num=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey()==entry.getValue())    num=entry.getKey();
        }
        // System.out.println(map);
        return num;
    }
}