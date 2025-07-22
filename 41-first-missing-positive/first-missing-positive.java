class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int i:nums) set.add(i);
        int count=1;
        while(true){
            if(!set.contains(count))    return count;
            count++;
        }

    }
}