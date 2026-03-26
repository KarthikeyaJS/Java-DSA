//main condition->if 3,4,7 return false;
//->remaining all numbers are valid
//->to be diff from x->

//  2   5 6   9

//88828->88858

//1000->10005

//1801809->1801806

//3222

class Solution {
    static boolean isValid(int n){
        boolean found=false;
        while(n>0){
            int x=n%10;
            if(x==3||x==4||x==7)    return false;
            if(x==2||x==5||x==6||x==9)  found=true;
            n=n/10;
        }
        return found;

    }
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=0;i<=n;i++){
            if(isValid(i))  count++;
        }
        return count;
    }
}

