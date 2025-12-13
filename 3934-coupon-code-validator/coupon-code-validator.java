class Solution {
    static class Pair{
        int priority;
        String code;
        Pair(int priority,String code){
            this.priority=priority;
            this.code=code;
        }
    }
    static boolean validCode(String s){
        String regex="^[a-zA-Z0-9_]+$";
        if(s.matches(regex))
            return true;
        return false;
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        
        int n=code.length;
        List<String> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        map.put("electronics",1);
        map.put("grocery",2);
        map.put("pharmacy",3);
        map.put("restaurant",4);
        List<Pair> valid=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(isActive[i]&& validCode(code[i]) && map.containsKey(businessLine[i])){
                valid.add(new Pair(map.get(businessLine[i]),code[i]));
            }
        }
        Collections.sort(valid,(a,b)->{
            if(a.priority!=b.priority)
                return a.priority-b.priority;
            return a.code.compareTo(b.code);
        });
        for(Pair p:valid)
            list.add(p.code);
        return list;
    }
}