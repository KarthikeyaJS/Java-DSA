class Solution {
    public int largestInteger(int num) {
        String s=Integer.toString(num);
        int[] odd=new int[10];
        int[] even=new int[10];

        for(char ch:s.toCharArray()){
            int d=ch-'0';
            if((d&1)==0)    even[d]++;
            else    odd[d]++;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            int d=ch-'0';
            if((d&1)==0){
                for(int i=8;i>=0;i-=2){
                    if(even[i]>0){
                        sb.append(i);
                        even[i]--;
                        break;
                    }
                }
            }
            else{
                for(int i=9;i>=1;i-=2){
                    if(odd[i]>0){
                        sb.append(i);
                        odd[i]--;
                        break;
                    }
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}