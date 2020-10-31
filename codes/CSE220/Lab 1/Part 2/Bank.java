public class Bank{
    public static void main(String[]args){
        BankAccount acc1=new BankAccount();
        BankAccount acc2=new BankAccount();
        BankAccount acc3=new BankAccount();
        acc1.setName("Shanto");
        acc2.setName("Shuvo");
        acc3.setName("Toron");
        acc1.setAccountID("17101399");
        acc2.setAccountID("16436545");
        acc3.setAccountID("32423434");
        acc1.setAddress("Gazipur");
        acc2.setAddress("Joydebpur");
        acc3.setAddress("Mirpur");
        acc1.setBalance(10000);
        acc2.setBalance(100000);
        acc3.setBalance(2000);
        acc1.addInterest();
        acc3.addInterest();
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());
    }
}