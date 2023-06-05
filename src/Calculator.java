import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Calculator;
    private JTextField textDisplay;
    private JButton AC;
    private JButton equal;
    private JButton multiply;
    private JButton minus;
    private JButton plus;
    private JButton blankButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton point;
    private JButton devide;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton percentage;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton cross;

    double num1, num2, result;
    String operation;

    public Calculator() {
        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    textDisplay.setText(textDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a9Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a0Button.getText());
            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textDisplay.getText().contains("."))
                {
                    textDisplay.setText(textDisplay.getText() + point.getText());
                }
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(textDisplay.getText());
                operation= "+";
                textDisplay.setText("");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(textDisplay.getText());
                operation= "-";
                textDisplay.setText("");
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(textDisplay.getText());
                operation= "*";
                textDisplay.setText("");
            }
        });
        devide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(textDisplay.getText());
                operation= "/";
                textDisplay.setText("");
            }
        });
        cross.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace= null;
                if(textDisplay.getText().length()>0)
                {
                    StringBuilder strB= new StringBuilder(textDisplay.getText());
                    strB.deleteCharAt(textDisplay.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    textDisplay.setText((backspace));
                }
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2= Double.parseDouble(textDisplay.getText());

                if(operation == "+")
                {
                    result = num1 + num2;
                    textDisplay.setText(String.valueOf(result));
                }
               else if(operation == "-")
                {
                    result = num1 - num2;
                    textDisplay.setText(String.valueOf(result));
                }
                else if(operation == "*")
                {
                    result = num1 * num2;
                    textDisplay.setText(String.valueOf(result));
                }
                else if(operation == "/")
                {
                    result = num1 / num2;
                    textDisplay.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
