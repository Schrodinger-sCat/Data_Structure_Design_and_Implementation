import java.util.Scanner;
public class QuadEqnTest{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the value of a, b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        QuadEqn q=new QuadEqn(a,b,c);
        System.out.println(q.firstRoot());
        sc.close();
    }
}