package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OurGUI extends JFrame {

    private JPanel panel;
    private JLabel title;
    private static JTextField pick;
    private OurButton button;

    public OurGUI() {

        setTitle("Library Book Borrowing Tracker");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
		panel.setBackground(Color.LightGray);

        title = new JLabel("LIBRARY BOOK BORROWING TRACKER");
        title.setFont(new Font("Times New Roman", Font.BOLD, 24));
        title.setBounds(180, 20, 600, 40);
        panel.add(title);

        panel.add(new OurChoices("1. BORROW A BOOK", 50, 120));
        panel.add(new OurChoices("2. RETURN A BOOK", 50, 170));
        panel.add(new OurChoices("3. VIEW RETURN AND BORROWED BOOKS", 50, 220));
        panel.add(new OurChoices("4. EXIT", 50, 270));

        JLabel enter = new JLabel("ENTER CHOICE:");
        enter.setFont(new Font("Times New Roman", Font.BOLD, 18));
        enter.setBounds(50, 330, 150, 30);
        panel.add(enter);

        pick = new JTextField();
        pick.setBounds(200, 330, 100, 30);
        panel.add(pick);

        button = new OurButton("Submit");
        button.setBounds(320, 330, 100, 30);
        panel.add(button);

        add(panel);
        setVisible(true);
    }

}

class OurChoices extends JLabel {

    public OurChoices(String text, int x, int y) {
        super(text);
        setFont(new Font("Times New Roman", Font.BOLD, 18));
        setBounds(x, y, 500, 30);
    }
}

class OurButton extends JButton implements ActionListener {
	
    public OurButton(String text) {
        super(text);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String input = OurGUI.pick.getText().trim();

        switch(input){
            case "1":
               new BookBorrow();
               break;
            case "2":
               break;
            case "3":
               break;
            case "4":
               break;
            default:
        }
    }
}

class BookBorrow extends JFrame {

    public BookBorrow() {

        setTitle("Borrow a Book");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("BORROW A BOOK");
        title.setFont(new Font("Times New Roman", Font.BOLD, 24));
        title.setBounds(350, 20, 300, 40);
        panel.add(title);

        add(panel);
        setVisible(true);
    }
}
