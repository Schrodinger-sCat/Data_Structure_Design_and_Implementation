import java.util.Scanner;
public class Binary_Search{
    public static void main(String[]shanto){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Values: ");
        int x=sc.nextInt();
        int []a=new int[x];
        System.out.println("Please Enter Your Values in Ascending Order:");
        for(int i=0;i<x;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Please Enter Your Desired Value:");
        int val=sc.nextInt();
        int st=0;
        int end=a.length-1;
        int mid=0;
        boolean b=true;
        while(st<=end){
            mid=(st+end)/2;
            if(val==a[mid]){
                b=false;
                System.out.println("Found at Index "+mid+".");
                break;
            }
            else if(val>a[mid]){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(b==true){
            System.out.println("Not found.");
        }
    }
}