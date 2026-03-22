import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.JButton;

public class MainFrameTest {

    @Test
    public void testAdditionner() {
        MainFrame frame = new MainFrame();
        int resultat = frame.additionner(2, 3);
        assertEquals(5, resultat);
    }

    @Test
    public void testSubmitButtonExists() {
        MainFrame frame = new MainFrame();
        
        java.awt.Component[] components = frame.getContentPane().getComponents();
        boolean found = false;
        
        for (java.awt.Component comp : components) {
            if (comp instanceof JButton) {
                JButton button = (JButton) comp;
                if ("Submit".equals(button.getText())) {
                    found = true;
                    break;
                }
            }
        }
        
        assertTrue("Submit button not found", found);
    }
}
