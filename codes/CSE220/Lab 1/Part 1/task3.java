import java.util.Scanner;
public class task3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[] array=new int[10];
    for(int i=0; i<5; i++){
      array[i]=sc.nextInt();
    }
    int temp=0;
    for(int i=0; i<4; i++){
      for(int j=i+1; j<5; j++){
        if(array[i]<array[j]){
          temp=array[i];
          array[i]=array[j];
          array[j]=temp;
        }
      }
    }
    for(int i=0; i<5; i++){
      System.out.print(array[i]);
      System.out.print(", ");
    }
    for(int i=0; i<5; i++){
      if(array[i]%2==0){
        System.out.print(array[i]);
        System.out.print(", ");
      }
    }
    sc.close();
  }
}