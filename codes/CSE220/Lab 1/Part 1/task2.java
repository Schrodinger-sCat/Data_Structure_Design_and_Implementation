import java.util.Scanner;
public class task2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[] array=new int[10];
    for(int i=0; i<10; i++){
      array[i]=sc.nextInt();
    }
    int min=0, max=0;
    for(int i=0; i<9; i++){
      if(array[max]<array[i]){
        max=i;
      }
      if(array[min]>array[i]){
        min=i;
      }
    }
    int temp=array[min];
    array[min]=array[max];
    array[max]=temp;
    for(int i=0; i<10; i++){
      System.out.print(array[i]);
      if(i==9){
        System.out.print(".");
      }
      else{
        System.out.print(", ");
      }
    }
    sc.close();
  }
}