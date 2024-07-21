import javax.swing.*;
public class pr1{
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JButton jb = new JButton("click");
        jb.setBounds(130,100,100, 40);
        jf.add(jb);
        jf.setSize(300,400);
        jf.setVisible(true);
        
    }
}
