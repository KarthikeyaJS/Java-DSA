class Solution {
    public int findMinFibonacciNumbers(int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int a=1,b=1;
        list.add(1);
        while(b<=k){
            list.add(b);
            int temp=a+b;
            a=b;
            b=temp;
        }
        int count=0;
        int i=list.size()-1;
        while(k>0){
            if(list.get(i)<=k){
                k=k-list.get(i);
                count++;
            }
            i--;
        }
        return count;
    }
}   