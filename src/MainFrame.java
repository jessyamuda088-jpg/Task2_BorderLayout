import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("BorderLayout Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Application Title", SwingConstants.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        westPanel.add(new JButton("Option 1"));
        westPanel.add(new JButton("Option 2"));
        westPanel.add(new JButton("Option 3"));
        add(westPanel, BorderLayout.WEST);

        JTextField textField = new JTextField();
        JScrollPane scrollPane = new JScrollPane(textField);
        add(scrollPane, BorderLayout.CENTER);

        add(new JButton("Submit"), BorderLayout.SOUTH);

        setVisible(true);
    }
}
