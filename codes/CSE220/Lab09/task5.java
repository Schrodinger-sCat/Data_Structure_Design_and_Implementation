import java.util.Scanner;
public class task5{
  public static int toThePower(int m, int n){
    if(n==0) return 1;
    if(n==1) return m;
    return m*toThePower(m,--n);
  }
  public static void main(String[]shanto){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    //int[] a={1, 2, 3, 4, 5, 6};
    System.out.println(toThePower(m,n));
  }
}