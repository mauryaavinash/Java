// runnable thead

class A implements Runnable{
   public void run(){
        int i = 0;
        for(i = 0; i < 10; i++)
            System.out.println("Thread A"+i);
    } 

}
class B implements Runnable{
    public void run (){
         int i = 0;
         for(i = 0; i < 10; i++)
             System.out.println("Thread B"+i);
     } 
 
 }

 public class pr1{
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        t1.start();
        t2.start();
      }
 }