class Solution {
    public int heightChecker(int[] arr) {
        int[] newArr =arr.clone();
        Arrays.sort(newArr);
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=newArr[i])   count++;
        }
        return count;
    }
}