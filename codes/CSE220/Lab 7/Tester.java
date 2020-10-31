import java.util.Scanner;
public class Tester{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Queue queue=new ListQueue();
        System.out.println("Enter name:");
        String n=sc.nextLine();
        System.out.println("Enter age:");
        int a=sc.nextInt();
        System.out.println("Enter blood group:");
        String b=sc.nextLine();
        WRM room=new WRM(n, a, b, queue);
        //System.out.pritnln(boolean room.CanDoctorGoHome());
        try{
        room.RegisterPatient();
        }catch(QueueOverflowException e){
            System.out.println("Err");
        }
        //System.out.println(boolean room.CanDoctorGoHome());
        sc.close();
    }
}