class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        Integer nums[]=new Integer[n];
        for(int i=0;i<n;i++)    nums[i]=arr[i];
        Arrays.sort(nums,(Integer a,Integer b)->{
            int cntA=Integer.bitCount(a);
            int cntB=Integer.bitCount(b);
            if(cntA!= cntB) return cntA-cntB;
            else    return a-b;
        });
        for(int i=0;i<n;i++)    arr[i]=nums[i];
        return arr;
    }
}