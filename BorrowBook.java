import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorrowBook extends JFrame
{
	private JLabel title;
	private JPanel north, center, east, west, south;
	private JButton back;
	
	BorrowBook()
	{
		setSize(900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Borrow a Book");
		setLayout(new BorderLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10,10,10,10);
		gbc.fill = GridBagConstraints.BOTH;
		
		north = new JPanel(new BorderLayout());
		north.setOpaque(false);
		title = new JLabel();
		title.setText("BORROW A BOOK");
		title.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 24));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBackground(new Color(255, 255, 255, 180));
		north.add(title);
		add(north, BorderLayout.NORTH);
		
		JButton button = new JButton("BACK");
		button.setFocusPainted(false);
		south = new JPanel();
		south.setPreferredSize(new Dimension(200, 10));
		south.setLayout(new GridBagLayout());
		gbc.gridx = 0; gbc.gridy = 0;
		
		south.add(button, gbc);
		
		add(south, BorderLayout.CENTER); 
		
		
		button.addActionListener(e -> {
			SwingUtilities.invokeLater(() -> new MainPage().setVisible(true));
		});
	}
}
