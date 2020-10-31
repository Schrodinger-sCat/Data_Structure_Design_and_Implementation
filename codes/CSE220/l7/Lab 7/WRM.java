public class WRM{
    public static int sum=0;
    public void RegisterPatient(){
        System.out.println("Enter name:");
        String n=sc.nextLine();
        System.out.println("Enter age:");
        int a=sc.nextInt();
        System.out.println("Enter blood group:");
        String b=sc.nextLine;
        Patient p=new Patient(n, a, b);
        p.id=""+sum;
        queue.enqueue(p);
    }
    public void ServePatient(){
        System.out.println("Patient no. "+queue.dequeue().id+" is served!");
    }
    public void CancelAll(){
        int j=queue.size;
        for(int i=0; i<j; i++){
            queue.dequeue();
        }
        System.out.println("All appointments are canceled");
    }
    public boolean CanDoctorGoHome(){
        if(queue.size==0){
            return true;
        }
        return false;
    }
}