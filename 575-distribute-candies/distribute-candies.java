class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int i: candyType){
            set.add(i);
        }
        int n=candyType.length;
        if(set.size()>=n/2){
            return n/2;
        }
        else{
            return set.size();
        }
    }
}