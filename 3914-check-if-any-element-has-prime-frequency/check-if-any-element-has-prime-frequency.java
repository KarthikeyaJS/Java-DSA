class Solution {
    static boolean isPrime(int n){
        if(n<=1)    return false;
        if(n<=3)    return true;
        if(n%2==0 || n%3==0)    return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0)    return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.values()){
            if(isPrime(i))  return true;
        }
        return false;
    }
}