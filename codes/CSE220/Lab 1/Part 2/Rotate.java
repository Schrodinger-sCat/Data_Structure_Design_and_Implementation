import java.util.Scanner;
import java.util.Arrays;
public class Rotate{
    public static int[] LeftRotate(int[] a, int n){
        
        for(int i=0; i<n; i++){
            int f=a[0];
            for(int j=1; j<a.length-1; j++){
                a[j-1]=a[j];
            }
            a[a.length-1]=f;
        }
        return a;
    }
    public static int[] RightRotate(int[] b, int n){
        
        for(int i=0; i<n; i++){
            int l=b[b.length-1];
            for(int j=b.length-1; j>0; j--){
                b[j]=b[j-1];
            }
            b[0]=l;
        }
        return b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array={1, 4, 8, 16, 25, 36, 49, 64, 81, 100};
        System.out.println(Arrays.toString(LeftRotate(array,n)));
        System.out.println(Arrays.toString(RightRotate(array,n)));
        sc.close();
    }
}