import java.util.*;
class Account{
    private int balance;

    public Account(int balance){
        this.balance = balance;
    }
    public boolean isInSufficientBalance(int amount){
        if(balance  > amount){
                return true;
        }
        else
            return false;
    }
    public void withdrawAmount(int amount){
        balance = balance - amount;
        System.out.println("balnce left is," + balance);
        System.out.println("withdrwal amount is," + amount);
    }
}

class Customer implements Runnable{
    private Account account;
    private String s;
    public Customer(Account account, String name){
        s = name;
        this.account = account;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        synchronized(account){
            System.out.println(s + ",enter amount to withdraw");
            int amt = sc.nextInt();
    
            if(account.isInSufficientBalance(amt)){
                account.withdrawAmount(amt);
            }
            else
                System.out.println("Insufficent balance");
        }
       
    }

}
public class pr3 {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        // Account a2 = new Account(1000);
        Customer c1 = new Customer(a1,"Avinash");
        Customer c2 = new Customer(a1,"Anuj");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
