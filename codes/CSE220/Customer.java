public class Customer{
    public static int c=0;
    public double balance;
    public Customer(){
        c++;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double b){
        balance=b;
    }
    public void deposit(double d){
        balance=balance+d;
    }
    public void withdraw(double w) throws Exception{
        if(w<=balance){
            balance=balance-w;
            System.out.println("Withdrawal completed");
        }
        else{
            throw new Exception(w);
        }
    }
}