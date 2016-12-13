import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by me on 12/10/2016.
 */
public class MainFrame extends JFrame {
    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;

    public MainFrame(){
        super("Hello World");

        setLayout(new BorderLayout());

        toolbar=new Toolbar();
        textPanel=new TextPanel();
        formPanel=new FormPanel();

        toolbar.setTextPanel(textPanel);
        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        formPanel.setFormListener(new FormListener() {
            @Override
            public void formEventOccurred(FormEvent e) {
                String name=e.getName();
                String occupation=e.getOccupation();
                int ageCat=e.getAgeCategory();
                textPanel.appendText(name+":"+occupation+":"+ageCat+"\n");
            }
        });


        add(toolbar,BorderLayout.NORTH);
        add(formPanel,BorderLayout.WEST);
        add(textPanel,BorderLayout.CENTER);

        setSize(600,500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
