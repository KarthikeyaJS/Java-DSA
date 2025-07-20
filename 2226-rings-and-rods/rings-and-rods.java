class Solution {
    public int countPoints(String rings) {
        int n=rings.length();
        HashMap<Character,HashSet<Character>> map=new HashMap<>();
        for(int i=n-1;i>=0;i-=2){
            map.putIfAbsent(rings.charAt(i),new HashSet<Character>());
            map.get(rings.charAt(i)).add(rings.charAt(i-1));
        }
        int count=0;
        for(Map.Entry<Character,HashSet<Character>> entry:map.entrySet()){
            if(entry.getValue().size()==3)  count++;
        }
        return count;
    }
}