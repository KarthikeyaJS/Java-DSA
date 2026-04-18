class Solution {
    public List<Integer> numOfBurgers(int tomato, int cheese) {
        List<Integer> list=new ArrayList<>();
        if((tomato&1)==1)
            return list;
        if(cheese>tomato)
            return list;
        int j,s;
        j=(tomato-2*cheese)/2;
        s=cheese-j;
        if(j<0 || s<0)  return list;
        list.add(j);
        list.add(s);

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



