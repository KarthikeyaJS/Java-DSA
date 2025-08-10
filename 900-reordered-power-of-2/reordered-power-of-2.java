class Solution {
    static String sortedString(int x){
        char[] arr=String.valueOf(x).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public boolean reorderedPowerOf2(int n) {
        String target=sortedString(n);
        for(int i=0;i<31;i++){
            if(sortedString(1<<i).equals(target))   return true;
        }
        return false;
    }
}