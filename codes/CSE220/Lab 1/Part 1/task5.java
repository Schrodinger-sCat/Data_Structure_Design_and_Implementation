import java.util.Scanner;
public class task5{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[] array=new int[10];
    for(int i=0; i<15; i++){
      int n=sc.nextInt();
      array[n]++;
    }
    for(int i=0; i<10; i++){
      System.out.println(i+" was found "+array[i]+" times.");
    }
    sc.close();
  }
}