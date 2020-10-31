import java.util.Scanner;
public class task4{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int[] array=new int[10];
    for(int i=0; i<10; i++){
      int flag=0;
      int n=sc.nextInt();
      if(i!=0){
        for(int j=i-1; j>=0; j--){
          if(n==array[j]){
            flag++;
          }
        }
      }
      if(flag==0){
        array[i]=n;
      }
      else{
        System.out.println(n+" already exists");
        i--;
      }
    }
    sc.close();
  }
}