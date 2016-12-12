import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by me on 12/10/2016.
 */
public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;
    private TextPanel textPanel;
    private StringListener textListener;

    public Toolbar(){
        helloButton=new JButton("Hello");
        goodbyeButton=new JButton("Goodbye");

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        setBorder(BorderFactory.createEtchedBorder());
        add(helloButton);
        add(goodbyeButton);
    }

    public void setTextPanel(TextPanel textPanel){
        this.textPanel=textPanel;
    }

    public void setStringListener(StringListener listener){
        this.textListener=listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked=(JButton)e.getSource();
        if (clicked==helloButton){
            if (textListener!=null) {
                textListener.textEmitted("Hello\n");
            }
        }else if (clicked==goodbyeButton){
            if (textListener!=null) {
                textPanel.appendText("goodbye\n");
            }
        }
    }
}
