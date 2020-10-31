import java.util.Scanner;
public class task11{
    public static boolean allDigitsOdd(int n){
        boolean b=true;
        for(int i=0; ;i++){
            if((n%10)%2==0){
                b=false;
                break;
            }
            else{
                n=n/10;
            }
            if(n==0){
                break;
            }
        }
        return b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println(allDigitsOdd(m)?"true":"false");
    }
}