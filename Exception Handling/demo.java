public class demo {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(100);
        c.deposit(500);

        try{
        System.out.println("\nWithdrawing $100...");
         c.withdraw(100.00);
         System.out.println("\nWithdrawing $600...");
         c.withdraw(600.00);
      } catch (InsufficientFundException e) {
         System.out.println("Sorry, but you are short $" + e.getAmount());
         e.printStackTrace();
      }
        }
    }
    
