import javax.swing.*;
import java.awt.*;

/**
 * Created by me on 12/10/2016.
 */
public class TextPanel extends JPanel {
    private JTextArea textArea;

    public TextPanel(){
        textArea=new JTextArea();
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
    public void appendText(String text){
        textArea.append(text);
    }
}
