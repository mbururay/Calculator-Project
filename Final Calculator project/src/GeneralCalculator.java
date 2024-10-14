import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class GeneralCalculator extends JFrame implements ActionListener {
    JLabel displayLabel;
    JPanel displayPanel;
    JPanel numberPanel;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button0;
    JButton buttonDecimal;
    JButton buttonEqual;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonTimes;
    JButton buttonDivide;
    String calcString;
    LinkedList<String> calcList = new LinkedList<>();

    public GeneralCalculator(){
        setSize(400,400);
        setTitle("This is a calculator");
        SpringLayout layout = new SpringLayout();
        setLayout(layout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Creation of the panel with numbers
        numberPanel = new JPanel();
        numberPanel.setSize(200,200);
        numberPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Border labelBorder = BorderFactory.createLineBorder(Color.BLACK, 5);
        numberPanel.setLayout(new GridLayout(4, 4));


        numberPanel.add(button1 = new JButton("1"));
        numberPanel.add(button2 = new JButton("2"));
        numberPanel.add(button3 = new JButton("3"));
        numberPanel.add(buttonPlus = new JButton("+"));

        numberPanel.add(button4 = new JButton("4"));
        numberPanel.add(button5 = new JButton("5"));
        numberPanel.add(button6 = new JButton("6"));
        numberPanel.add(buttonMinus = new JButton("-"));

        numberPanel.add(button7 = new JButton("7"));
        numberPanel.add(button8 = new JButton("8"));
        numberPanel.add(button9 = new JButton("9"));
        numberPanel.add(buttonTimes = new JButton("*"));

        numberPanel.add(button0 = new JButton("0"));
        numberPanel.add(buttonDecimal = new JButton("."));
        numberPanel.add(buttonEqual = new JButton("="));
        numberPanel.add(buttonDivide = new JButton("/"));



        button1.addActionListener(this);
        button1.setActionCommand("Action1");
        button2.addActionListener(this);
        button2.setActionCommand("Action2");
        button3.addActionListener(this);
        button3.setActionCommand("Action3");
        button4.addActionListener(this);
        button4.setActionCommand("Action4");
        button5.addActionListener(this);
        button5.setActionCommand("Action5");
        button6.addActionListener(this);
        button6.setActionCommand("Action6");
        button7.addActionListener(this);
        button7.setActionCommand("Action7");
        button8.addActionListener(this);
        button8.setActionCommand("Action8");
        button9.addActionListener(this);
        button9.setActionCommand("Action9");
        button0.addActionListener(this);
        button0.setActionCommand("Action0");
        buttonDecimal.addActionListener(this);
        buttonDecimal.setActionCommand("ActionDecimal");
        buttonEqual.addActionListener(this);
        buttonEqual.setActionCommand("ActionEqual");
        buttonPlus.addActionListener(this);
        buttonPlus.setActionCommand("ActionPlus");
        buttonMinus.addActionListener(this);
        buttonMinus.setActionCommand("ActionMinus");
        buttonDivide.addActionListener(this);
        buttonDivide.setActionCommand("ActionDivide");
        buttonTimes.addActionListener(this);
        buttonTimes.setActionCommand("ActionTimes");


        //Creation of the display panel where operations will take place
        displayPanel = new JPanel();
        displayPanel.setLayout(new GridLayout(1, 1));
        numberPanel.setBorder(labelBorder);

        add(numberPanel);
        add(displayPanel);

        //Creation of the display label
        displayLabel = new JLabel();
        displayLabel = new JLabel("Display: 0", SwingConstants.RIGHT);
        displayLabel.setFont(new Font("Arial", Font.BOLD, 24));
        displayLabel.setSize(100,100);
        displayLabel.setBorder(labelBorder);
        displayPanel.add(displayLabel);


        // Configure SpringLayout constraints for displayPanel
        layout.putConstraint(SpringLayout.NORTH, displayPanel, 0, SpringLayout.NORTH, getContentPane());
        layout.putConstraint(SpringLayout.WEST, displayPanel, 0, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.EAST, displayPanel, 0, SpringLayout.EAST, getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, displayPanel, 150, SpringLayout.NORTH, getContentPane());

        // Configure SpringLayout constraints for numberPanel
        layout.putConstraint(SpringLayout.NORTH, numberPanel, 0, SpringLayout.SOUTH, displayPanel);
        layout.putConstraint(SpringLayout.WEST, numberPanel, 0, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.EAST, numberPanel, 0, SpringLayout.EAST, getContentPane());
        layout.putConstraint(SpringLayout.SOUTH, numberPanel, 0, SpringLayout.SOUTH, getContentPane());



        setVisible(true);
    }

    public void listPrinter(LinkedList list){
        for(int i = 0 ; i<list.size();i++){
            System.out.println(list.get(i));


        }
    }


    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Action1":

                calcList.add("1");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);

                break;
            case "Action2":
                calcList.add("2");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;
            case "Action3":
                calcList.add("3");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;
            case "Action4":
                calcList.add("4");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;

            case "Action5":
                calcList.add("5");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;
            case "Action6":
                calcList.add("6");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;
            case "Action7":
                calcList.add("7");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;
            case "Action8":
                calcList.add("8");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;
            case "Action9":
                calcList.add("9");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;
            case "Action0":
                calcList.add("0");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;
            case "ActionPlus":
                calcList.add("+");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;
            case "ActionMinus":
                calcList.add("-");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;
            case "ActionDivide":
                calcList.add("/");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;
            case "ActionDecimal":
                calcList.add(".");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;
            case "ActionTimes":
                calcList.add("*");
                calcString = calcList.stream().collect(Collectors.joining());
                displayLabel.setText(calcString);
                break;



        }

    }



    public static void main(String[] args){
        new GeneralCalculator();
    }
}
