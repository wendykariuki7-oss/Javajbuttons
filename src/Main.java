import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("RadioButton");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


//        create buttons
        JRadioButton bird = new JRadioButton("bird");
        JRadioButton cat = new JRadioButton("cat");
        JRadioButton dog = new JRadioButton("dog");
        JRadioButton rabbit = new JRadioButton("rabbit");
        JRadioButton pig = new JRadioButton("pig");

        JLabel image = new JLabel();
//        group buttons
        ButtonGroup group = new ButtonGroup();
        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        //        create buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.Y_AXIS));

        buttonPanel.add(bird);
        buttonPanel.add(cat);
        buttonPanel.add(dog);
        buttonPanel.add(rabbit);
        buttonPanel.add(pig);

        // Add the panels to our window
        frame.setLayout(new BorderLayout());

        frame.add(buttonPanel, BorderLayout.WEST);
        frame.add(image, BorderLayout.CENTER);


        bird.addActionListener(jButtonAction -> JOptionPane.showMessageDialog(frame, new ImageIcon("src/images/bird.jpg")));
        cat.addActionListener(jButtonAction -> JOptionPane.showMessageDialog(frame, new ImageIcon("src/images/cat.jpg")));

        dog.addActionListener(jButtonAction -> JOptionPane.showMessageDialog(frame, new ImageIcon("src/images/dog.jpg")));

        pig.addActionListener(jButtonAction -> JOptionPane.showMessageDialog(frame, new ImageIcon("src/images/pig.jpg")));

        rabbit.addActionListener(jButtonAction-> JOptionPane.showMessageDialog(frame, new ImageIcon("src/images/rabbit.jpg")));
        frame.setVisible(true);

    }
}

