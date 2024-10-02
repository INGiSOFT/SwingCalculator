import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(String text) {

        // Execute either one ...
        super(text);
        // setText(text);

        setSize(20, 20);
        setFont(new Font("Sans Serif", Font.BOLD, 16));
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setFocusable(false);
    }
}
