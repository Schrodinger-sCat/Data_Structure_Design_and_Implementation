public class WRM{
    public static int sum=0;
    public String n;
    public String b;
    public int a;
    public Queue queue;
    public WRM(String n, int a, String b, Queue queue){
        n=n;
        a=a;
        b=b;
        queue=queue;
    }
    public void RegisterPatient()throws QueueOverflowException{
        Patient p=new Patient(n, a, b);
        p.id=""+sum;
        queue.enqueue(p);
        sum++;
    }
    public void ServePatient()throws QueueUnderflowException{
        System.out.println("Patient no. "+queue.dequeue().id+" is served!");
    }
    public void CancelAll() throws QueueUnderflowException{
        int j=queue.size();
        for(int i=0; i<j; i++){
            queue.dequeue();
        }
        System.out.println("All appointments are canceled");
    }
    public boolean CanDoctorGoHome(){
        if(queue.size()==0){
            return true;
        }
        return false;
    }
}