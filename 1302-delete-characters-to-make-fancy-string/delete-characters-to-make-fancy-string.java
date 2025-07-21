class Solution {
    public String makeFancyString(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(char ch:s.toCharArray()){
            if(stack.size()>=2){
                char top=stack.pop();
                char secondTop=stack.peek();
                stack.push(top);

                if(top==ch && secondTop==ch)    continue;
            }
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}