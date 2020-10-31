import java.util.Scanner;
import static java.lang.Character.*;
import java.util.Stack;//you should use the stack you have built in assignment 03. If you are using your own stack, remove this line; otherwise, import & use java's default stack class.
public class CSE220Assignment04{
    public static String postFixBuilder(String s){
        Stack<Stack> stack=new Stack<>();
        Stack<Character> ch=new Stack<>();
        stack.push(ch);
        String r="";
        char[] chars=s.toCharArray();
        for(char c:chars){
            if(c=='('||c=='{'||c=='['){
                Stack<Character> chn=new Stack<>();
                stack.push(chn);
            }
            else if(c==')'||c=='}'||c==']'){
                if(stack.peek().empty()){
                    stack.pop();
                }
                else{
                    while(stack.peek().empty()==false){
                        r=r+(stack.peek()).pop();
                    }
                }
                stack.pop();
            }
            else if(c=='+'||c=='-'||c=='*'||c=='/'){
                if(stack.peek().empty()){
                    stack.peek().push(c);
                }
                else{
                    char p=(char)stack.peek().peek();
                    if(c=='*'&&(p.equals('+')||p.equals('-'))){
                        stack.peek().push(c);
                    }
                    else if(c=='/'&&(p.compareTo('+')||p.compareTo('-'))){
                        stack.peek().push(c);
                    }
                    else{
                        r=r+stack.peek().pop();
                    }
                }
            }
            else{
                r=r+c;
            }
        }
        return null; //remove this line
    }
    public static int postFixEvaluator(String s){
        Stack <Integer> st=new Stack <Integer>();
        char []a=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]>='0' && a[i]<='9'){
                int x=((int)a[i])-48;
                st.push(x);
            }
            else{
                int x=st.pop();
                int y=st.pop();
                int z=0;
                if(a[i]=='+'){
                    z=y+x;
                }
                if(a[i]=='-'){
                    z=y-x;
                }
                if(a[i]=='*'){
                    z=y*x;
                }
                if(a[i]=='/'){
                    z=y/x;
                }
                if(a[i]=='%'){
                    z=y%x;
                }
                st.push(z);
            }
        }
        int result=st.pop();
        return result;
    }
    public static void main(String[]args){
        String exp=new Scanner(System.in).next();
        String postFixExp = postFixBuilder(exp);
        System.out.println("Post Fix Expression: "+postFixExp);
        int result = postFixEvaluator(postFixExp);
        System.out.println("Answer: "+result);
    }
}