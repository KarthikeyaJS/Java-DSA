class Solution {
    public String replaceDigits(String s) {
        char[] arr=s.toCharArray();
        int n= (s.length()&1)==0?s.length():s.length()-1;
        for(int i=0;i<n;i+=2){
            // System.out.println((int)arr[i]);
            arr[i+1]=(char)((int)arr[i]+(int)arr[i+1]-'0');
        }
        return new String(arr);
    }
}