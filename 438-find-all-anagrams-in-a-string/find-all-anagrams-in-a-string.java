class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pArr=new int[26];
        int[] sArr=new int[26];
        List<Integer> list=new ArrayList<>();
        int m=p.length();
        for(int i=0;i<m;i++){
            pArr[p.charAt(i)-'a']++;
        }
        int n=s.length();
        for(int i=0;i<n;i++){
            sArr[s.charAt(i)-'a']++;
            if(i>=m){
                sArr[s.charAt(i-m)-'a']--;
            }
            if(Arrays.equals(sArr,pArr)){
                list.add(i-m+1);
            }
        }
        return list;
    }
}