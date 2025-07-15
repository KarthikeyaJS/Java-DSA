class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3) return false;
        boolean hasVowel=false;
        boolean hasConstant=false;
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' || ch=='i' ||ch =='o'|| ch=='u'||
                ch=='A' || ch=='E' || ch=='I' ||ch =='O'|| ch=='U'){
                    hasVowel=true;
                }
                else{
                    hasConstant =true;
                }
            }
        }
        return hasVowel &&hasConstant;
    }
}