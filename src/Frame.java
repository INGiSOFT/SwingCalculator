import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    private JPanel displayPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();

    private ActionListener buttonListener = new ButtonListener();

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

        Button button0 = new Button("0");
        button0.addActionListener(buttonListener);

        Button button1 = new Button("1");
        button1.addActionListener(buttonListener);

        Button button2 = new Button("2");
        button2.addActionListener(buttonListener);

        Button button3 = new Button("3");
        button3.addActionListener(buttonListener);

        Button button4 = new Button("4");
        button4.addActionListener(buttonListener);

        Button button5 = new Button("5");
        button5.addActionListener(buttonListener);

        Button button6 = new Button("6");
        button6.addActionListener(buttonListener);

        Button button7 = new Button("7");
        button7.addActionListener(buttonListener);

        Button button8 = new Button("8");
        button8.addActionListener(buttonListener);

        Button button9 = new Button("9");
        button9.addActionListener(buttonListener);

        Button buttonDot = new Button(".");
        JButton buttonEqual = new Button("=");
        buttonEqual.setBackground(Color.BLUE);

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

        setVisible(true);
    }
}
