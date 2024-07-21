public class CheckingAccount {

    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundException{
        if(balance >= amount){
            balance -= amount;
        }
        else{
            double need = amount - balance;
           
            throw new InsufficientFundException(need);
        }
    }
        public double getBalance() {
            return balance;
        }
         
         public int getNumber() {
            return number;
        }
    
}
