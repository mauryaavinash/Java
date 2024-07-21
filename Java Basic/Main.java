import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Example1 ex1 = new Example1();
        Example1 ex2 = new Example1("Anuj","Varanasi");
        ex1.setName("Avinash");
        ex1.setAddress("Mirzapur");
        System.out.println(ex1.getAddress());
        System.out.println(ex1.getName());
        System.out.println(ex2.getName());
        System.out.println(ex2.getAddress());
        String name;
        String address;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        address = sc.nextLine();
        Example1 ex3 = new Example1(name,address);
        System.out.println(ex3.getName());
        System.out.println(ex3.getAddress());


        


    }
}
