import java.util.Stack;
public class stackTest{
    public static void main(String[]args){
        Stack<Character>c=new Stack<>();
        Stack<Integer>i=new Stack<>();
        c.push('a');
        c.push('b');
        i.push(10);
        Stack<Stack>s=new Stack<>();
        s.push(c);
        s.push(i);
        s.peek.push(5);
        System.out.println(s.empty());
        System.out.println(s.pop());
        System.out.println((s.peek()).pop());
        System.out.println((s.peek()).pop());
    }
}