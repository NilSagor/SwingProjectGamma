import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by me on 12/10/2016.
 */
public class MainFrame extends JFrame {
    private TextPanel textPanel;
    private JButton btn;

    public MainFrame(){
        super("Hello World");

        setLayout(new BorderLayout());
        textPanel=new TextPanel();
        btn=new JButton("Okay");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Hello\n");
            }
        });

        add(textPanel,BorderLayout.CENTER);
        add(btn,BorderLayout.SOUTH);
        setSize(600,500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
