import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{
    private final int WIDTH = 550;
    private final int HEIGHT = 450;
    public Frame(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(this.WIDTH, this.HEIGHT);
        this.setTitle("Al-Khwarizmi");

    }
}
