import java.util.Scanner;
public class keyBased{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] array={11, 7, 9, 6, 3, 8, 9, 2, 6};
        int max=array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        int[] a=new int[max+1];
        for(int i=0; i<array.length; i++){
            a[array[i]]++;
        }
        //Searching part
        System.out.println("Give a number to search");
        int n=sc.nextInt();
        if(n<0||n>a.length-1||a[n]==0){
            System.out.println("does not exists");
        }
        else{
            System.out.println("Exists");
        }
        //Sorting part
        System.out.println("Sorting.....");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i]; j++){
                System.out.print(i+" ");
            }
        }
    }
}