//Fibonacci with memoization
import java.util.Scanner;
public class task2{
    public static int[] array=new int[46];
    public static int fibonacci(int n){
        if(n<=1) return n;
        if(array[n]==-1){
            array[n]= fibonacci(n-1)+fibonacci(n-2);
        }
        return array[n];
    }
    public static void main(String[]shanto){
        for(int i=0; i<46; i++){
            array[i]=-1;
        }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacci(n));
    }
}