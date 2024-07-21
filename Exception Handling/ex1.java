// unchecked exception handling

class ex1{
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage()); 
        } 
        catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());

         }
        finally{
            System.out.println("e.getMessage()");
        }
        System.out.println("e.getMessage()");
    }
}