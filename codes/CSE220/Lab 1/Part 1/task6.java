import java.util.Scanner;
public class task6{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("how much number do you want to give me?");
    int n=sc.nextInt();
    int[] array=new int[n];
    for(int i=0; i<n; i++){
      array[i]=sc.nextInt();
    }
    int flag=0;
    for(int i=0; i<=n/2; i++){
      if(array[i]!=array[(n-1)-i]){
        System.out.println("not palindrome");
        flag++;
        break;
      }
    }
    if(flag==0){
      System.out.println("palindrome");
    }
    sc.close();
  }
}