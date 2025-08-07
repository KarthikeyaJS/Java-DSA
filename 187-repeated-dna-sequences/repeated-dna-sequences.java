class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set1=new HashSet<>();
        HashSet<String> set2=new HashSet<>();
        int n=s.length();
        for(int i=0;i<=n-10;i++){
            String str=s.substring(i,i+10);
            if(!set1.add(str)){
                set2.add(str);
            }
        }
        return new ArrayList<>(set2);
    }
}