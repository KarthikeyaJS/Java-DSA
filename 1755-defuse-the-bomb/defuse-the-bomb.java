class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] result=new int[n];
        if(k==0){
            return result;
        }
        int[] temp=new int[2*n];
        for(int i=0;i<n;i++){
            temp[i]=code[i];
            temp[i+n]=code[i];
        }
        for(int i:temp)
        System.out.print(i+" ");
        for(int i=0;i<n;i++){
            int sum=0;
            if(k>0){
                for(int j=i+1;j<=i+k;j++){
                    sum=sum+temp[j];
                }
            }
            else{
                for(int j=i+n+k;j<i+n;j++){
                    sum=sum+temp[j];
                }
            }
            result[i]=sum;
        }
        return result;
    }
}