//import java.util.Scanner;
public class task3{
  public static String print(int[] a, int i){
    if(i==a.length-1) return ""+a[i];
    return a[i]+" "+print(a, ++i);
  }
  public static void main(String[]shanto){
    //Scanner sc=new Scanner(System.in);
    //int n=sc.nextInt();
    int[] a={1, 2, 3, 4, 5, 6};
    System.out.println(print(a,0));
  }
}