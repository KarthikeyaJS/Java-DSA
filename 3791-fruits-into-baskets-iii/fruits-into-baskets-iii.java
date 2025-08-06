class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        List<Integer> list=new ArrayList<>();
        int m=baskets.length;
        int a=(int)Math.sqrt(m);

        int count=0,maxi=0;
        for(int i=0;i<m;i++){
            if(count==a){
                list.add(maxi);
                maxi=baskets[i];
                count=1;
            }
            else{
                count++;
                maxi=Math.max(maxi,baskets[i]);
            }
        }   
        list.add(maxi);
        int remain=0;

        for(int i=0;i<fruits.length;i++){
            int k=0,set=1;
            for(int j=0;j<m;j+=a){
                if(list.get(k)<fruits[i]){
                    k++;
                    continue;
                }
                for(int r=j;r<Math.min(j+a,m);r++){
                    if(baskets[r]>=fruits[i]){
                        set=0;
                        baskets[r]=0;
                        break;
                    }
                }
                if(set==0){
                    list.set(k,0);
                    for(int r=j;r<Math.min(j+a,m);r++){
                        list.set(k,Math.max(baskets[r],list.get(k)));
                    }
                    break;
                }
            }
            remain+=set;
        }
        return remain;
    }
}