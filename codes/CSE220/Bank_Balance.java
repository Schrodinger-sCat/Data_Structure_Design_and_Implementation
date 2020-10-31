public class Bank_Balance{
    public static void main(String[]args){
        Customer[] customer=new Customer[5];
        for(int i=0; i<5; i++){
            customer[i]=new Customer();
        }
        customer[0].setBalance(100);
        customer[0].deposit(50);
        try{
            customer[0].withdraw(20);
            customer[0].withdraw(180);
        }catch(Exception e){
            System.out.println("Exception khailam "+e);
        }
        System.out.println(customer[0].getBalance());
    }
}