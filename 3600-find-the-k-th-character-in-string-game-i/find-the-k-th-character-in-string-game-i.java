class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder();
        sb.append("a");
        int n=1;
        while(n<k){
            int x=sb.length();
            for(int i=0;i<x;i++){
                sb.append((char)(sb.charAt(i)+1));
                n++;
            }
        }
        // System.out.println(sb);
        return sb.charAt(k-1);
    }
}