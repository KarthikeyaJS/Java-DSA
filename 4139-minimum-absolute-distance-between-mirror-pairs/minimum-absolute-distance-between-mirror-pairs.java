class Solution {
    static int rev(int n){
        int rev=0;
        boolean isNeg=n>0?false:true;
        n=Math.abs(n);
        while(n>0){
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        
        return isNeg?rev*-1:rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int mini=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     map.put(nums[i],i);
        // }
        for(int i=0;i<n;i++){
            // int reverse=rev(nums[i]);
            
            if(map.containsKey(nums[i])){
                mini=Math.min(mini,i-map.get(nums[i]));
            }
            map.put(rev(nums[i]),i);
        }
        return mini==Integer.MAX_VALUE?-1:mini;

    }
}