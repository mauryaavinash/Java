//package Exception Handling;
// explicit thrpw exception

public class ex2 {
    public static void main(String[] args) {
        int bal = 3000;
        int withdraw_amount = 5000;
        try {
            if(bal > withdraw_amount)
             throw new ArithmeticException("Insufficient balance");

        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println("Hello");
    }
}
