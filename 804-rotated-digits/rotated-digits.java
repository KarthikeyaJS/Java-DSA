class Solution {
    static boolean has347(int n){
        while(n>0){
            int x=n%10;
            if(x==3||x==4||x==7)    return true;
            n=n/10;
        }
        return false;
    }
    static int rotate(int n){
        int newNo=0;
        int pow=1;
        while(n>0){
            int x=n%10;
            if(x==2)    x=5;
            else if(x==5)    x=2;
            else if(x==6)    x=9;
            else if(x==9)    x=6;
            newNo=(pow*x)+newNo;
            n=n/10;
            pow=pow*10;
        }
        System.out.println(newNo);
        return newNo;
    }
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=0;i<=n;i++){
            if(has347(i))   continue;
            if(i!=rotate(i))    count++;
        }
        return count;
    }
}