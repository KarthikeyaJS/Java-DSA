class Solution {
    static int[] getDigitCount(int num){
        int[] count=new int[10];
        while(num>0){
            int dig=num%10;
            count[dig]++;
            num=num/10;
        }
        return count;
    }

    static boolean isEqual(int[] arr1,int[] arr2){
        for(int i=0;i<10;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean reorderedPowerOf2(int n) {
        int[] count=getDigitCount(n);
        int pow=1;
        for(int i=0;i<31;i++){
            int[] countOfPow=getDigitCount(pow);
            if(isEqual(count,countOfPow)){
                return true;
            }
            pow=pow*2;
        }
        return false;
    }
}