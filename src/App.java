import javax.swing.*;

/**
 * Created by me on 12/10/2016.
 */
public class App {
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
