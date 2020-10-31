import java.util.Scanner;
public class task10{
    public static void season(int m, int d){
        if((m>=3)&&(m<=6)){
            if((m==3)&&(d>=16)){
                System.out.println("Spring");
            }
            else if((m==3)&&(d<=15)){
                System.out.println("Winter");
            }
            else if((m==6)&&(d<=15)){
                System.out.println("Spring");
            }
            else if((m==6)&&(d>=16)){
                System.out.println("Summer");
            }
            else{
                System.out.println("Spring");
            }
        }
        else if((m<=7)&&(m>=9)){
            if((m==9)&&(d>=16)){
                System.out.println("Fall");
            }
            else{
                System.out.println("Summer");
            }
        }
        else if((m<=12)&&(m>9)){
            if((m==12)&&(d>=15)){
                System.out.println("Winter");
            }
            else{
                System.out.println("Fall");
            }
        }
        else{
            System.out.println("Winter");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int d= sc.nextInt();
        season(m,d);
        sc.close();
    }
}