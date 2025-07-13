class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Thread t1=new Thread(()->Arrays.sort(players));
        Thread t2=new Thread(()->Arrays.sort(trainers));
        // Arrays.sort(players);
        // Arrays.sort(trainers);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            // e.printStackTrace();
        }
        int n=players.length,m=trainers.length;
        int count=0,i=0,j=0;
        while(i<n &&j<m){
            if(players[i]<=trainers[j]){
                i++;
                j++;
                count++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}