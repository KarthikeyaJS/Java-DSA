class Solution {
    public int maximumLength(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        int n=s.length();
        for(int start=0;start<n;start++){
            StringBuilder sb=new StringBuilder();
            for(int end=start;end<n;end++){
                if(sb.length()==0 || sb.charAt(sb.length()-1)==s.charAt(end)){
                    sb.append(s.charAt(end));
                    map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
                }
                else{
                    break;
                }
            }
        }
        int ans=0;
        for(String str:map.keySet()){
            if(map.get(str)>=3 && str.length()>ans) 
                ans=str.length();   
        }
        if(ans==0)  return -1;
        return ans;
    }
}