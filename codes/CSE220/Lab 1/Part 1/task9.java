import java.util.Arrays;
import java.util.Scanner;
public class task9{
  public static int[] square(int[] arr, int l){
    for(int i=0; i<l; i++){
      arr[i]=arr[i]*arr[i];
    }
    return arr;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[] array=new int[10];
    for(int i=0; i<10; i++){
      array[i]=sc.nextInt();
    }
    System.out.print(Arrays.toString(square(array, array.length)));
    sc.close();
  }
}