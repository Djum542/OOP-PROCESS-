import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.FlowView;

public class Frame extends JFrame {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        // tao nên bộ đệm kép và bố cục luồng
        JPanel p = new JPanel();
        // dung tao ra hinh anh
        JLabel l = new JLabel();
        JButton b = new JButton();
        j.setTitle("window");
        j.setSize(400, 500);
        j.add(p);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
p.add(l);
p.add(b);
b.setSize(100, 100);
    }
}
