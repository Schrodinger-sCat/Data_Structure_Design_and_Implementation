import java.util.Scanner;
public class task8{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give the size of two matrices");
    int n=sc.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
    System.out.println("Give numbers for 1st Matrix");
    for(int i=0; i<n; i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Give numbers for 2nd Matrix");
    for(int i=0; i<n; i++){
      b[i]=sc.nextInt();
    }
    for(int i=0; i<n; i++){
      System.out.print(5*a[i]-b[i]+" ");
    }
    sc.close();
  }
}