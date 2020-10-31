import java.util.Scanner;
public class bhalu{
    public static void main(String[]args){
        int[] array={1,2,3,4,5,6,7,8};
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        for(int i=start; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        if(start!=0){
            for(int j=0; j<start; j++){
                System.out.print(array[j]+" ");
            }
        }
        sc.close();
    }
}