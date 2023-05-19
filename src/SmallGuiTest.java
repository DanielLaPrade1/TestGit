import javax.swing.*;
import java.awt.*;

public class SmallGuiTest extends JFrame
{
    public JButton help;
    public SmallGuiTest()
    {
        setLayout(new FlowLayout());

        help = new JButton();
        help.setText("Help Me!");

        add(help);

        setSize(new Dimension(100, 100));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
