class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb=new StringBuilder(s);
        int n=shifts.length;
        shifts[n-1]=shifts[n-1]%26;
        for(int i=n-2;i>=0;i--){
            shifts[i]=shifts[i]+shifts[i+1];
            shifts[i]=shifts[i]%26;
        }
        n=sb.length();
        for(int i=0;i<n;i++){
            sb.setCharAt(i,(char)( (sb.charAt(i)-'a'+shifts[i])%26 +'a'));
        }
        System.out.println(sb);
        return sb.toString();
    }
}