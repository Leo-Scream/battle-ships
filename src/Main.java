import javax.swing.*;

/**
 * @author Verhoturov Denis - Leo.Scream.
 */
public class Main
{
    public static void main(String[] args)
    {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }

        int random = (int) Math.random();
        controllers.Game game = new controllers.Game();
    }
}
