import java.util.Scanner;
public class Tester{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Queue queue=new ListQueue();
        WRM room=new WRM();
        System.out.pritnln(room.CanDoctorGoHome());
        room.RegisterPatient();
        System.out.println(room.CanDoctorGoHome());
        sc.close();
    }
}