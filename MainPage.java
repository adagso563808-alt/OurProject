package Practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPage extends JFrame implements ActionListener
{
	private JLabel title;
	private JPanel north, center;
	private JButton borrowBook,  returnBook, viewBook, exit;
	
	MainPage()
	{
		setSize(900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Library Book Borrowing Tracker");
		setLayout(new BorderLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10,10,10,10);
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 15;
		gbc.ipadx = 40;
		
		Dimension buttonSize = new Dimension(250, 30);
		
		north = new JPanel(new BorderLayout());
		north.setOpaque(false);
		title = new JLabel();
		title.setText("LIBRARY BOOK BORROWING TRACKER");
		title.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 24));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBackground(new Color(255, 255, 255, 180));
		north.add(title);
		
		borrowBook = new JButton("BORROW A BOOK");
		borrowBook.setFocusPainted(false);
		borrowBook.setPreferredSize(buttonSize);
		returnBook = new JButton("RETURN A BOOK");
		returnBook.setFocusPainted(false);
		returnBook.setPreferredSize(buttonSize);
		viewBook = new JButton("VIEW RETURNED AND BORROWED BOOKS");
		viewBook.setFocusPainted(false);
		viewBook.setPreferredSize(buttonSize);
		exit = new JButton("EXIT");
		exit.setFocusPainted(false);
		exit.setPreferredSize(buttonSize);
		
		center = new JPanel();
		center.setLayout(new GridBagLayout());
		
		gbc.gridy = 0;
		center.add(borrowBook,gbc);
		gbc.gridy = 1;
		center.add(returnBook, gbc);
		gbc.gridy = 2;
		center.add(viewBook, gbc);
		gbc.gridy = 3;
		center.add(exit, gbc);
		
		borrowBook.addActionListener(this);
		returnBook.addActionListener(this);
		viewBook.addActionListener(this);
		exit.addActionListener(this);
		
		add(center, BorderLayout.CENTER);
		add(north, BorderLayout.NORTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == borrowBook)
		{
			SwingUtilities.invokeLater(() -> new BorrowBook().setVisible(true));
		}
		
		if(e.getSource() == returnBook)
		{
			
		}
		
		if(e.getSource() == viewBook)
		{
			
		}
		
		if(e.getSource() == exit) 
		{
			System.exit(0);
		}
		
	}
	
}
