
import  java.awt.*;
import java.awt.event.*;
import  javax.swing.*;

public class SimpleCUI extends JFrame{
    private JButton button = new JButton("Btn1");
    private JTextField input = new JTextField("", 5);
    private JLabel labal = new JLabel("Юрец, привет из Gui");
    private JRadioButton rBtn1 = new JRadioButton("Юра");
    private JRadioButton rBtn2 = new JRadioButton("Эдик");
    private JCheckBox checkBox = new JCheckBox("check");

    public  SimpleCUI(){
        super("First App");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(labal);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(rBtn1);
        group.add(rBtn2);

        container.add(rBtn1);
        rBtn1.setSelected((true));
        container.add(rBtn2);

        container.add(checkBox);

        button.addActionListener(new ButtonEventListener ());
        container.add(button);



    }
    class ButtonEventListener implements ActionListener{
        public void  actionPerformed(ActionEvent e){
            String message = "";
            message += "Button was pressed\n";
            message += "Text is " +input.getText() + "\n";
            message += (rBtn1.isSelected()?"Radio 1":"Radio 2") + "isSelected";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
