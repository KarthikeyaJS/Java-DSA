class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr=new int[5];
        for(char ch:text.toCharArray()){
            if(ch=='b') arr[0]++;
            else if(ch=='a')    arr[1]++;
            else if(ch=='l')    arr[2]++;
            else if(ch=='o')    arr[3]++;
            else if(ch=='n')    arr[4]++;
        }
        arr[2]=arr[2]/2;
        arr[3]=arr[3]/2;
        int mini=Integer.MAX_VALUE;
        for(int i:arr){
            mini=Math.min(mini,i);
        }
        return mini;
    }
}