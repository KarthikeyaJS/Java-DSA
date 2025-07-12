class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int t1=event2[0].compareTo(event1[1]);
        int t2=event2[1].compareTo(event1[0]);
        return (t1<=0) && (t2>=0);
        // return false;
    }
}