import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private JPanel displayPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();

    public Frame() {

        setVisible(true);
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

        Button button0 = new Button("0");
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button buttonDot = new Button(".");
        JButton buttonEqual = new Button("=");

        // Weird ...
        buttonEqual.setBackground(Color.BLUE);
        buttonEqual.setForeground(Color.WHITE);

        buttonPanel.setLayout(new GridLayout(4,4));

        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);

        buttonPanel.add(buttonPlus);
        buttonPanel.add(buttonMinus);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(buttonDot);
        buttonPanel.add(buttonEqual);

        add(displayPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

    }
}
