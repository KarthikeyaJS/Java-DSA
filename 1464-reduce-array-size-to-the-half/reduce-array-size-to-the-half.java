// store freq
// set-> add elements
// find point when arr length becomes <=half
// return size of set

class Pair{
    int k;
    int v;
    Pair(int k,int v){
        this.k=k;
        this.v=v;
    }
}
class Solution {
    public int minSetSize(int[] arr) {
        List<Pair> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            Pair p=new Pair(entry.getKey(),entry.getValue());
            list.add(p);
        }
        Collections.sort(list, new Comparator<Pair>(){
            @Override
            public int compare(Pair p1,Pair p2){
                return p2.v-p1.v;
            }
        });
        int count=n;
        for(Pair i:list){
            set.add(i.k);
            count=count-i.v;
            if(count<=n/2)  return set.size();
        }
        
        return 0;

    }
}


