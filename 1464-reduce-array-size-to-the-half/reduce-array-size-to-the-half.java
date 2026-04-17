class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] freq=new int[map.values().size()];
        int i=0;
        for(int f:map.values()){
            freq[i++]=f;
        }
        Arrays.sort(freq);
        i=freq.length-1;
        int half=arr.length/2;
        int count=0;
        int remove=0;
        while(remove<half){
            count+=1;
            remove+=freq[i--];
        }
        return count;
    }
}