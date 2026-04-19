class Transaction{
    String name;
    int time;
    int amount;
    String place;
    Transaction (String s){
        String[] arr=s.split(",");
        name=arr[0];
        time=Integer.parseInt(arr[1]);
        amount=Integer.parseInt(arr[2]);
        place=arr[3];
    }
}
class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> invalid =new ArrayList<>();
        HashMap<String,List<Transaction>> map =new HashMap<>();
        for(String s:transactions){
            Transaction t=new Transaction(s);
            map.putIfAbsent(t.name,new ArrayList<>());
            map.get(t.name).add(t);
        }
        // System.out.println(map);
        for(String s:transactions){
            Transaction t=new Transaction(s);
            if(!isValid(t,map.get(t.name))){
                invalid.add(s);
            }
        }
        return invalid;
    }
    static boolean isValid(Transaction t,List<Transaction> list){
        if(t.amount>1000)   return false;
        for(Transaction ta:list){
            if(Math.abs(ta.time-t.time)<=60 && !ta.place.equals(t.place)){
                return false;
            }
        }
        return true;
    }
}