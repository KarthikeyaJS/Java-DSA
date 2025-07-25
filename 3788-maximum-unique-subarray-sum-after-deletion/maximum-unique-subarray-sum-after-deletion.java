class Solution {
    public int maxSum(int[] nums) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        int negMaxi=Integer.MIN_VALUE;
        for(int i:nums) {
            if(i>=0)
                set.add(i);
            else{
                negMaxi=Math.max(i,negMaxi);
            }
        }
        int[] arr=new int[set.size()];
        int j=0;
        for(int i:set){
            arr[j++]=i;
        }
        if(arr.length==0)   return negMaxi;
        int maxi=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.max(arr[i],sum+arr[i]);
            maxi=Math.max(maxi,sum);
        }
        return maxi;
    }
}