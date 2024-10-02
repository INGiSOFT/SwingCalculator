import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        Button button = (Button) e.getSource();

        System.out.println(button.getText());
    }
}
