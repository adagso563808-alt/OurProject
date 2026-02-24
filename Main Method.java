package Dagso;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Mavenproject1 
{
 
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> new Frame().setVisible(true));
    }
}

class Frame extends JFrame 
{
    private JButton btnBorrow, btnReturn, btnView, exit;
    private JPanel east, center;
    private DefaultTableModel model;
    private JTable table;
     Frame()
    {
        setSize(900, 600);
        setTitle("Library Book Borrowing Tracker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setBackground(Color.red);
        setResizable(false);
        
        btnBorrow = new JButton("BORROW BOOK");
        btnBorrow.setFocusPainted(false);
        btnReturn = new JButton("RETURN BOOK");
        btnReturn.setFocusPainted(false);
        btnView = new JButton("VIEW RETURNED AND BORROWED BOOKS"); 
        btnView.setFocusPainted(false);
        exit = new JButton("EXIT");  
        exit.setFocusPainted(false);
        
        east = new JPanel();
        east.setLayout(new GridLayout(4, 1, 10, 10));
        east.add(btnBorrow);
        east.add(btnReturn);
        east.add(btnView);
        east.add(exit);
        
        add(east, BorderLayout.EAST);
        
        center = new JPanel();
        center.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        JLabel title = new JLabel("Library Borrowing Tracker");
        title.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 32));
        center.add(title);
        add(center, BorderLayout.CENTER);
        
        btnBorrow.addActionListener(e -> {borrowWindow();});
        btnView.addActionListener(e -> {view();});
        
    }
     
     public void borrowWindow()
     {
         JFrame borrow = new JFrame();
         borrow.setSize(900, 600);
         borrow.setLocationRelativeTo(null);
         borrow.setTitle("Borrow A Book");
         borrow.setLayout(new BorderLayout());
         
         JPanel center, west;
         JLabel bookName, author, dateBorrowed;
         JTextField nameField, authorField, dateField;
         
         bookName = new JLabel();
         author = new JLabel();
         dateBorrowed = new JLabel();
         
         nameField = new JTextField();
         authorField = new JTextField();
         dateField = new JTextField();
         
           
                 
         GridBagConstraints gbc = new GridBagConstraints();
         gbc.fill = GridBagConstraints.BOTH;
        
         center = new JPanel();
         center.setLayout(new GridBagLayout());
         
         gbc.gridx = 0;
         gbc.gridy = 0;
         gbc.gridwidth = 2;
         center.add(new JLabel("Enter Borrowed Book"), gbc);
         borrow.add(center, BorderLayout.WEST);
         
         
         
         
         
         
         
         
         borrow.setVisible(true);
     }
     
     public void view()
     {
         JFrame view = new JFrame();
         view.setSize(900, 600);
         view.setLocationRelativeTo(null);
         view.setTitle("Borrow A Book");
         view.setLayout(new BorderLayout());
         
         String[] column = {"Name of Book", "Borrowed/Returned", "Date Borrowed", "Date Returned"};
         
         model = new DefaultTableModel(column, 0);
         table = new JTable(model);
         
         view.setVisible(true);
     }
}
