class Solution {
    public int calculate(String s) {
        Stack<Integer> stack=new Stack<>();
        int number=0;
        int sign=1;
        int result=0;
        for(char ch:s.toCharArray()){
            if(ch=='+'){
                result=result+sign*number;
                number=0;
                sign=1;
            }
            else if(ch=='-'){
                result=result+sign*number;
                number=0;
                sign=-1;
            }
            else if(ch=='('){
                stack.add(result);
                stack.add(sign);
                result=0;
                sign=1;
            }
            else if(ch==')'){
                result=result+sign*number;
                number=0;
                result=result*stack.pop();
                result=result+stack.pop();
            }
            else if(ch!=' '){
                number=number*10+(ch-'0');
            }
        }
        if(number!=0)   result=result+sign*number;
        return result;
    }
}
