class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        if(n%2!=0)  return false;
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                if(ch==')' && stack.pop()!='(' ||
                ch==']' && stack.pop()!='[' ||
                ch=='}' && stack.pop()!='{')    return false;
            }
        }
        return stack.isEmpty();   
    }
}