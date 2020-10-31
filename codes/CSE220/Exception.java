public class Exception extends Throwable{
    public double amount;
    public Exception(double a){
        amount=a;
    }
    public String toString(){
        return "Insufficient balance. You don't have "+amount+" tk in your account";
    }
}