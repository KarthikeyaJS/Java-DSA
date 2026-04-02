class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> res=new ArrayList<>();
        String a="qwertyuiopQWERTYUIOP";
        String b="asdfghjklASDFGHJKL";
        String c="zxcvbnmZXCVBNM";

        for(String s:words){
            boolean ina=false;
            boolean inb=false;
            boolean inc=false;
            for(char ch:s.toCharArray()){
                if(a.indexOf(ch)!=-1)  ina=true;
                else if(b.indexOf(ch)!=-1)  inb=true;
                else inc=true;
            }
            if(ina && inb ||  ina && inc || inb && inc) continue;
            res.add(s);
        }
        return res.toArray(new String[0]);
    }
}