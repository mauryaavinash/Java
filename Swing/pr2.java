import javax.swing.*;
public class pr2 extends JFrame{
    JLabel l1,l2 ,l3,l4;
    JTextField t1,t2;
    JButton b1;
    public pr2(){}
    public pr2(String s){
        super(s);
    }
    

    public static void main(String[] args) {
        pr2 jf = new pr2("Addition");
        jf.setSize(300,400);
        jf.setVisible(true);
    }
}
