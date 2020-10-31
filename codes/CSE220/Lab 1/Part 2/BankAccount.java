public class BankAccount{
    public String n, ac, ad;
    public double b;
    public String getName(){
        return n;
    }
    public void setName(String n){
        this.n=n;
    }
    public String getAccountID(){
        return ac;
    }
    public void setAccountID(String i){
        this.ac=i;
    }
    public String getAddress(){
        return ad;
    }
    public void setAddress(String a){
        this.ad=a;
    }
    public double getBalance(){
        return b;
    }
    public void setBalance(double c){
        this.b=c;
    }
    public void addInterest(){
        this.b=b+((7.0*b)/100);
    }
    public String toString(){
        return "name: "+n+", acc.id: "+ac+", address: "+ad+", balance: "+b;
    }
}