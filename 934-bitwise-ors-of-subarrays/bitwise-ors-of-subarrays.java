class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> ans=new HashSet<>();
        HashSet<Integer> curr=new HashSet<>();
        curr.add(0);
        for(int i:arr){
            HashSet<Integer> curr2=new HashSet<>();
            for(int j:curr){
                curr2.add(i|j);
            }
            curr2.add(i);
            curr=curr2;
            ans.addAll(curr);
        }
        return ans.size();
    }
}