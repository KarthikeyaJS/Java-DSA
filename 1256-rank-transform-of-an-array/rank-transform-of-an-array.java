import java.util.Set;
import java.util.HashSet;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i:arr)  set.add(i);
        int n=set.size();
        int[] nums=new int[n];
        int idx=0;
        for(int i:set){
            nums[idx++]=i;
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            map.put(nums[i],i+1);
        }
        // System.out.println(map);
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}