import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    private JPanel displayPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();

    private ActionListener buttonListener = new ButtonListener();

    private final JButton[] numberButtons = new JButton[10];

    public Frame() {

        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JLabel displayLabel = new JLabel("Display");
        displayPanel.add(displayLabel);

        Button buttonPlus = new Button("+");
        Button buttonMinus = new Button("-");
        Button buttonMultiply = new Button("*");
        Button buttonDivide = new Button("/");

        for (int i = 0; i < numberButtons.length; i++) {

            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(buttonListener);
            buttonPanel.add(numberButtons[i]);
        }

        JButton buttonDot = new Button(".");
        JButton buttonEqual = new Button("=");
        buttonEqual.setBackground(Color.BLUE);

        buttonPanel.setLayout(new GridLayout(4,4));

        buttonPanel.add(buttonPlus);
        buttonPanel.add(buttonMinus);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(buttonDot);
        buttonPanel.add(buttonEqual);

        add(displayPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
