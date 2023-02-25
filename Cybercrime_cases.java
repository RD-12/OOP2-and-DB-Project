import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Cybercrime_cases {

	 JFrame frame;
	 private JTextField cash_MS;
	 private JTextField Card_Number;
	 private JTextField Cardholder;
	 private JTextField Expiry_date;
	 private JTextField CVV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cybercrime_cases window = new Cybercrime_cases();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cybercrime_cases() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(800,830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setLocationRelativeTo(null);
		
		JButton Cash = new JButton("Cash");
		Cash.setFont(new Font("Tahoma", Font.BOLD, ١٥));
		Cash.setBounds(42, 388, 89, 23);
		frame.getContentPane().add(Cash);
		Cash.setOpaque(false);
		Cash.setContentAreaFilled(false);
		Cash.setBorderPainted(false);
		
		JButton Card = new JButton("Credit Card");
		Card.setFont(new Font("Tahoma", Font.BOLD, ١٥));
		Card.setBounds(40, 424, 139, 23);
		frame.getContentPane().add(Card);
		Card.setOpaque(false);
		Card.setContentAreaFilled(false);
		Card.setBorderPainted(false);
		
		JLabel Payment_Methods = new JLabel("Payment Methods");
		Payment_Methods.setForeground(new Color(255, 255, 255));
		Payment_Methods.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, ١٤));
		Payment_Methods.setBounds(67, 335, 154, 30);
		frame.getContentPane().add(Payment_Methods);
		
		JLabel Label_1 = new JLabel("1. ");
		Label_1.setFont(new Font("Luminari", Font.BOLD, ١٥));
		Label_1.setBounds(42, 391, 32, 16);
		frame.getContentPane().add(Label_1);
		
		JLabel Label_2 = new JLabel("2. ");
		Label_2.setFont(new Font("Luminari", Font.BOLD, ١٥));
		Label_2.setBounds(42, 427, 32, 16);
		frame.getContentPane().add(Label_2);
		
		JLabel Label_3 = new JLabel("  ");
		Label_3.setForeground(new Color(128, 0, 0));
		Label_3.setFont(new Font("Times New Roman", Font.BOLD, ١٤));
		Label_3.setHorizontalAlignment(SwingConstants.CENTER);
		Label_3.setBounds(205, 635, 407, 16);
		frame.getContentPane().add(Label_3);
		
		JLabel Label_4 = new JLabel("  ");
		Label_4.setHorizontalAlignment(SwingConstants.CENTER);
		Label_4.setForeground(new Color(255, 255, 255));
		Label_4.setFont(new Font("Tahoma", Font.BOLD, ١٥));
		Label_4.setBounds(64, 304, 593, 34);
		frame.getContentPane().add(Label_4);
 
		cash_MS = new JTextField();
		cash_MS.setHorizontalAlignment(SwingConstants.CENTER);
		cash_MS.setFont(new Font("Kohinoor Telugu", Font.BOLD, ١٧));
		cash_MS.setBounds(194, 504, 407, 30);
		frame.getContentPane().add(cash_MS);
		cash_MS.setBackground(new Color(0, 0, 0, 0));
		cash_MS.setColumns(10);
		
		Card_Number = new JTextField("Card Number");
		Card_Number.setHorizontalAlignment(SwingConstants.CENTER);
		Card_Number.setFont(new Font("Times New Roman", Font.ITALIC, ١٨));
		Card_Number.setBounds(247, 606, 307, 30);
		frame.getContentPane().add(Card_Number);
		Card_Number.setColumns(10);
		Card_Number.setVisible(false);
		
		Cardholder = new JTextField("Cardholder Name");
		Cardholder.setHorizontalAlignment(SwingConstants.CENTER);
		Cardholder.setFont(new Font("Times New Roman", Font.ITALIC, ١٨));
		Cardholder.setBounds(247, 564, 307, 30);
		frame.getContentPane().add(Cardholder);
		Cardholder.setColumns(10);
		Cardholder.setVisible(false);
		
		Expiry_date = new JTextField("MM/YY");
		Expiry_date.setHorizontalAlignment(SwingConstants.CENTER);
		Expiry_date.setFont(new Font("Times New Roman", Font.ITALIC, ١٥));
		Expiry_date.setBounds(406, 663, 148, 30);
		frame.getContentPane().add(Expiry_date);
		Expiry_date.setColumns(10);
		Expiry_date.setVisible(false);
		
		CVV = new JTextField("CVV");
		CVV.setHorizontalAlignment(SwingConstants.CENTER);
		CVV.setFont(new Font("Times New Roman", Font.ITALIC, ١٥));
		CVV.setBounds(247, 663, 139, 30);
		frame.getContentPane().add(CVV);
		CVV.setColumns(10);
		CVV.setVisible(false);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, ١٣));
		comboBox.setMaximumRowCount(3);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"names of the lawyers", "Hussein Abdullah        600 SR", "Saud Khaled              988 SR", "Firas Fahd                 400 SR", "Rawan Muhammad    1300 SR", "Jumana Ibrahim         900 SR", "Saad Ibrahim             400 SR"}));
		comboBox.setBounds(104, 237, 526, 96);
		frame.getContentPane().add(comboBox);

		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/rawan/Desktop/12.png"));
		lblNewLabel.setBounds(6, 6, 788, 790);
		frame.getContentPane().add(lblNewLabel);
		
		JButton OK = new JButton("OK");
		OK.setFont(new Font("Tahoma", Font.PLAIN, ١٣));
		OK.setBounds(479, 717, 101, 60);
		frame.getContentPane().add(OK);
		
		JButton Exit = new JButton("Exit");
		Exit.setBounds(215, 716, 89, 61);
		frame.getContentPane().add(Exit);
		
		
		
		comboBox.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent e)
			{
				String data = "The chosen lawyer and the bill: "   
						   + comboBox.getItemAt(comboBox.getSelectedIndex());  
				Label_4.setText(data);

			
				
				
			}
		});
		
		Exit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				Categories x = new Categories();
        		x.frame9.setVisible(true);
        		frame.dispose();	
			}
		});
		
		OK.addActionListener(new ActionListener() 
		{
			Border border = BorderFactory.createLineBorder(Color.RED, 4);
			String check_number = "[0-9]+";
			public void actionPerformed(ActionEvent e)
			{
				if(cash_MS.getText().equals("Please go to the nearest branch reception to pay"))
				{Successful_reservation x = new Successful_reservation();
        		x.frame.setVisible(true);
        		frame.dispose();}
				
				if(cash_MS.getText().equals("Please enter your card information"))
				{
					if(Cardholder.getText().equals("Cardholder Name"))
					{Cardholder.setBorder(border);}
					
					if(Expiry_date.getText().equals("MM/YY"))
					{Expiry_date.setBorder(border);}
					
					if(CVV.getText().equals("CVV"))
					{CVV.setBorder(border);}
					
					if(Card_Number.getText().equals("Card Number") || !(Card_Number.getText().length() == 16 && Card_Number.getText().matches(check_number)))
					{
						Card_Number.setBorder(border);
						Label_3.setText("The Card number must be 16 digits");
					}
					else
					{
						Successful_reservation x = new Successful_reservation();
		        		x.frame.setVisible(true);
		        		frame.dispose();
					}
					
				}
				
			}
		});
		
		Cash.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				cash_MS.setText("Please go to the nearest branch reception to pay");
				Cardholder.setVisible(false);
				Expiry_date.setVisible(false);
				CVV.setVisible(false);
				Card_Number.setVisible(false);

				
			}
		});
		
		Card.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				cash_MS.setText("Please enter your card information");
				Card_Number.setVisible(true);
				Cardholder.setVisible(true);
				Expiry_date.setVisible(true);
				CVV.setVisible(true);
				
				
			}
		});


			
	}	

	}
