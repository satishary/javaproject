package basics;


import java.util.Stack;


public class StackBracketExpression {
    public static void main(String args[]){
        Stack<Integer>stack=new Stack<>();
        String expression="(a+(c+d-k)*(e-j(d-e))-(c+d*(b+a/q))-u)";
        //()   )(
        expression="("+expression + ")";
       char[]chars=expression.toCharArray();
       for(int i=0;i<=chars.length-1;i++){
           char ch=chars[i];
           if(ch=='('){
               stack.push(i);
               
           }
           if(ch==')'){
               int pos=stack.pop();
               System.out.println();
               for(int j=pos;j<=i;j++)
                   System.out.print(chars[j]);
           }
       }
    }
    
}
