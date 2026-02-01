package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OurGUI extends JFrame {

    private JPanel panel;
    private JLabel title;
    static JTextField pick;
    private OurButton button;

    public OurGUI() {

        setTitle("Library Book Borrowing Tracker");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
		panel.setBackground(Color.lightGray);

        title = new JLabel("LIBRARY BOOK BORROWING TRACKER");
        title.setFont(new Font("Times New Roman", Font.BOLD, 24));
        title.setBounds(180, 20, 600, 40);
        panel.add(title);

        panel.add(new OurChoices("1. BORROW A BOOK", 50, 120));
        panel.add(new OurChoices("2. RETURN A BOOK", 50, 170));
        panel.add(new OurChoices("3. VIEW RETURNED AND BORROWED BOOKS", 50, 220));
        panel.add(new OurChoices("4. EXIT", 50, 270));

        JLabel enter = new JLabel("ENTER CHOICE:");
        enter.setFont(new Font("Times New Roman", Font.BOLD, 18));
        enter.setBounds(50, 330, 150, 30);
        panel.add(enter);

        pick = new JTextField();
        pick.setBounds(200, 330, 100, 30);
        pick.setFont(new Font("Times New Roman", Font.BOLD, 18));
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

        try {
        
        int input = Integer.parseInt(OurGUI.pick.getText().trim());
        
        switch(input){
            case 1:
               new BookBorrow();
               break;
            case 2:
               new ReturnBook();
               break;
            case 3:
               break;
            case 4:
            	if(input == 4) {
            		JOptionPane.showMessageDialog(null, "Thank you for your transaction!");
            	}
            	System.exit(1);
               break;
            default:
            	JOptionPane.showMessageDialog(null,"Enter a number 1 to 4 only!");
            	break;
        }
        }catch(NumberFormatException ex) {
        	JOptionPane.showMessageDialog(null, ex);
        }
        
     }
  }
	
// OPTION 1
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

// OPTION 2
class ReturnBook extends JFrame {

    public ReturnBook() {

        setTitle("Return a book");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("RETURN A BOOK");
        title.setFont(new Font("Times New Roman", Font.BOLD, 24));
        title.setBounds(350, 20, 300, 40);
        panel.add(title);

        add(panel);
        setVisible(true);
    }
}
