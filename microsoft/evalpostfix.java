class evalpostfix{
    public int evalRPN(String[] tokens) {
        Stack<Integer> S=new Stack<>();
        for(int i =0;i<tokens.length;i++){
            String ch=tokens[i];
            if (!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/"))
            {
                S.push(Integer.valueOf(ch));
            }
            
            else {
                int a=S.pop();
                int b=S.pop();
                if(ch.equals("+")){
                    S.push(a+b);
                }
                if(ch.equals("-")){
                    S.push(b-a);
                }
                if(ch.equals("/")){
                    S.push(b/a);
                }
                if(ch.equals("*")){
                    S.push(b*a);
                }
            }
        }
        return S.pop();
    }
}