import java.util.Scanner;
class Task3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,n=sc.nextInt();
        int a[]=new int[n];
        try{
            a[5]=99;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        try{
            x=n/0;
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } finally{
            System.out.println("THE END");
        }
    }
}
