class Solution {
    public List<Integer> numOfBurgers(int tomato, int cheese) {
        List<Integer> list=new ArrayList<>();
        if((tomato&1)==1)
            return list;
        if(cheese>tomato)
            return list;
        int x,y;
        x=(tomato-(2*cheese))/2;
        y=cheese-x;
        tomato=tomato-(4*x+2*y);
        cheese=cheese-(x+y);
        if(tomato==0 && cheese==0 && x>=0 && y>=0){
            list.add(x);
            list.add(y);
        }

        return list;
    }
}

// 4x+2y=t
// 4(c-y)+2y=t
// 4c-4y+2y=t
// 4c-2y=t
// 2(2c-y)=t
// -y=(t/2)-2c

// x+y=c

// x=c-y



