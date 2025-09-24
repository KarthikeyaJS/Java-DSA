class Solution {
    public String fractionToDecimal(int num, int denom) {
        if(num==0){
            return "0";
        }
        StringBuilder fraction=new StringBuilder();
        if(num<0 ^ denom<0){
            fraction.append("-");
        }
        long dividend=Math.abs(Long.valueOf(num));
        long divisor=Math.abs(Long.valueOf(denom));
        fraction.append(dividend/divisor);
        long remainder=dividend%divisor;
        if(remainder==0){
            return fraction.toString();
        }
        fraction.append(".");
        HashMap<Long,Integer> map=new HashMap<>();
        while(remainder!=0){
            if(map.containsKey(remainder)){
                fraction.insert(map.get(remainder),"(");
                fraction.append(")");
                break;
            }
            map.put(remainder,fraction.length());
            remainder=remainder*10;
            fraction.append(remainder/divisor);
            remainder=remainder%divisor;
        }
        return fraction.toString();
    }
}