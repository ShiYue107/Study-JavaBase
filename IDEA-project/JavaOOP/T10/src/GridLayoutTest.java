import javax.swing.*;

public class GridLayoutTest extends JFrame {
    public void init(){
        setLayout(new java.awt.GridLayout(4,4));
        for (int i = 0; i <4*4; i++) {
            this.add(new JButton(""+i));
        }
        this.setSize(500,300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutTest().init();
    }
}
