import java.util.Scanner;
public class task4{
  public static String binary(int n){
    if(n==0) return ""+0;
    return n%2+" "+binary(n/2);
  }
  public static void main(String[]shanto){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s= new StringBuffer(binary(n)).reverse().toString();
    System.out.println(s);
  }
}