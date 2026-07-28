class Solution {
    public String smallestPalindrome(String s) {
        int[] arr=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        String middle="";
        for(int i=0;i<26;i++){
            if((arr[i]&1)==1){
                if(middle.equals("")){
                    middle=String.valueOf((char)(i+97));
                    arr[i]--;
                }
            }
            String ch=String.valueOf((char)(i+97));
            sb.append(ch.repeat(arr[i]/2));
        }

        String half= new StringBuilder(sb).reverse().toString();
        return sb.toString()+middle+half;
    }
}