class Solution {
    public String convertToBase7(int num) {
        if(num==0)  return "0";
        boolean isNeg=num<0;
        StringBuilder sb=new StringBuilder();
        num=Math.abs(num);
        while(num>0){
            int rem=num%7;
            sb.append(rem);
            num=num/7;
        }
        if(isNeg)   sb.append("-");
        return sb.reverse().toString();
    }
}