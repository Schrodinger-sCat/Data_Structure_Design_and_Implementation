public class Tester{
    public static int BrackBalance(String ex)throws Exception{
        Stack stack=new ListStack();
        char[] chars=ex.toCharArray();
        for(char c:chars){
            if(c=='('||c==')'||c=='{'||c=='}'||c=='['||c==']'){
                if(stack.isEmpty()){
                    stack.push(c);
                }
                else{
                    if((char)stack.peek()=='(' && c==')'){
                        stack.pop();
                    }
                    else if((char)stack.peek()=='{' && c=='}'){
                        stack.pop();
                    }
                    else if((char)stack.peek()=='[' && c==']'){
                        stack.pop();
                    }
                    else{
                        stack.push(c);
                    }
                }
            }
        }
        return stack.size();
    }
    public static void main(String[]args){
        String[] st={"1+2]*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14","1+2*[3*3+{4–5(6(7/8/9)+10)}–11+(12*8)/{13+13}]+14","1+2*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14","1+2*(3/4)"};
        for(String s:st){
            int count=0;
            try{
                int r=BrackBalance(s);
                if(r==0){
                    System.out.println(s+"\n"+"This expression is correct.");
                    System.out.println();
                }
                else{
                    char[] ch=s.toCharArray();
                    for(int i=0; i<ch.length; i++){
                        if(ch[i]=='('||ch[i]==')'||ch[i]=='{'||ch[i]=='}'||ch[i]=='['||ch[i]==']'){
                            count++;
                            if(count==r){
                                System.out.println(s+"\n"+"This expression is NOT correct.");
                                System.out.println("Error at character# "+(i+1)+". '"+ch[i]+"' - not closed");
                                System.out.println();
                            }
                        }
                    }
                }
            }catch(Exception e){
                System.out.println("Error");
            }
        }
    }
}
