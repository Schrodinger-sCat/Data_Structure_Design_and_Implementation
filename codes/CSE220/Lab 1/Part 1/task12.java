import java.util.Scanner;
public class task12{
    public static void dateComparision(int m1, int d1, int m2, int d2){
        if(m1>m2){
            System.out.println(m2+"/"+d2+" comes before "+m1+"/"+d1);
        }
        else if(m1<m2){
            System.out.println(m1+"/"+d1+" comes before "+m2+"/"+d2);
        }
        else{
            if(d1>d2){
                System.out.println(m2+"/"+d2+" comes before "+m1+"/"+d1);
            }
            else if(d1<d2){
                System.out.println(m1+"/"+d1+" comes before "+m2+"/"+d2);
            }
            else{
                System.out.println(m2+"/"+d2+" and "+m1+"/"+d1+" are same date");
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int d1=sc.nextInt();
        int m2=sc.nextInt();
        int d2=sc.nextInt();
        dateComparision(m1,d1,m2,d2);
        sc.close();
    }
}