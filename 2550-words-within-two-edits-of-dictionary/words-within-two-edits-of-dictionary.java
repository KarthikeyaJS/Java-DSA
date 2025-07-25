class Solution {
    static int hammingDistance(String q,String d){
        int count=0;
        int n=q.length();
        for(int i=0;i<n;i++){
            if(q.charAt(i)!=d.charAt(i))    count++;
        }
        return count;
    }
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        if(queries[0].length()==1){
            return Arrays.asList(queries);
        }
        for(String q:queries){
            for(String d:dictionary){
                if(hammingDistance(q,d)<=2){
                    list.add(q);
                    break;
                }
            }
        }
        return list;
    }
}