import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LetterFrame extends JFrame {
    private JLabel label;
    private int size = 24;

    public LetterFrame() {
        setTitle("Click to Increase Letter Size");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("A", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, size));
        label.setPreferredSize(new Dimension(300, 200));
        add(label);

        addMouseListener(new MouseAdapter() {
            @Override
public void mouseClicked(MouseEvent e) {
                size += 10;
                label.setFont(new Font("Arial", Font.PLAIN, size));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LetterFrame());
    }
}
