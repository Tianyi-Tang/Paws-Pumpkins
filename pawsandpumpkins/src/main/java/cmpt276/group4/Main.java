package cmpt276.group4;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Main {
    public static void main( String[] args )
    {
        PanelController controller = PanelController.getInstance();
        controller.createMainWindow();

        // GameManager manager = GameManager.getInstance();
        // manager.createMainWindow();
        System.out.println("Hello World" );

    }
}
