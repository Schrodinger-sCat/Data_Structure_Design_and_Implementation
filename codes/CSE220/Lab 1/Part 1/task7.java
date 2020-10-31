import java.util.Scanner;
public class task7{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[] array=new int[10];
    for(int i=0; i<10; i++){
      array[i]=sc.nextInt();
    }
    System.out.println("Give a number between 0 to 9");
    int n=sc.nextInt();
    for(int i=0; i<array[n]; i++){
      System.out.print("*");
    }
    sc.close();
  }
}