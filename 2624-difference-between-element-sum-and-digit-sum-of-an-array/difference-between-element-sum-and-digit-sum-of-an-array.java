class Solution {
    static int func(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int eleSum=0;
        int digSum=0;
        for(int i:nums){
            eleSum=eleSum+i;
        }
        for(int i:nums){
            digSum=digSum+func(i);
        }
        return Math.abs(digSum-eleSum);
    }
}