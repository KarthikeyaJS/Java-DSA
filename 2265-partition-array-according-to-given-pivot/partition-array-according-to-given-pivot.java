class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        int count=0;
        for(int i:nums){
            if(i<pivot) list1.add(i);
            else if(i>pivot)   list2.add(i);
            else count++;
        }
        int i=0;
        for(int j:list1){
            nums[i++]=j;
        }
        for(int j=0;j<count;j++){
            nums[i++]=pivot;
        }
        for(int j:list2){
            nums[i++]=j;
        }
        
        return nums;
    }
}