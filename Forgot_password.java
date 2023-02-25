import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;

public class Forgot_password 
{

	JFrame frame;
	private JTextField number;
	private JTextField code_1;
	private JTextField code_2;
	private JTextField code_3;
	private JTextField code_4;
	private JLabel digits;
	private JLabel code;
	private JButton GO;
	private JButton back;
	

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run()
			{
				try 
				{
					Forgot_password window = new Forgot_password();
					window.frame.setVisible(true);
				}
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	public Forgot_password() 
	{
		initialize();
	}

	
	private void initialize() 
	{
		frame = new JFrame();
		frame.setSize(930,780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		number = new JTextField();
		number.setFont(new Font("Kohinoor Bangla", Font.BOLD, ١٧));
		number.setBounds(459, 252, 293, 36);
		number.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(number);
		number.setColumns(10);
		
		code_1 = new JTextField();
		code_1.setHorizontalAlignment(SwingConstants.CENTER);
		code_1.setFont(new Font("Kohinoor Bangla", Font.BOLD, ١٨));
		code_1.setBounds(224, 579, 65, 48);
		code_1.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(code_1);
		code_1.setColumns(10);
		
		code_2 = new JTextField();
		code_2.setHorizontalAlignment(SwingConstants.CENTER);
		code_2.setFont(new Font("Kohinoor Bangla", Font.BOLD, ١٨));
		code_2.setColumns(10);
		code_2.setBounds(365, 579, 65, 48);
		code_2.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(code_2);
		
		code_3 = new JTextField();
		code_3.setHorizontalAlignment(SwingConstants.CENTER);
		code_3.setFont(new Font("Kohinoor Bangla", Font.BOLD, ١٨));
		code_3.setColumns(10);
		code_3.setBounds(505, 579, 65, 48);
		code_3.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(code_3);
		
		code_4 = new JTextField();
		code_4.setHorizontalAlignment(SwingConstants.CENTER);
		code_4.setFont(new Font("Kohinoor Bangla", Font.BOLD, ١٨));
		code_4.setColumns(10);
		code_4.setBounds(646, 579, 65, 48);
		code_4.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(code_4);
		
		digits = new JLabel("  ");
		digits.setForeground(new Color(128, 0, 0));
		digits.setFont(new Font("Baskerville", Font.BOLD, ١٥));
		digits.setBounds(550, 299, 307, 16);
		frame.getContentPane().add(digits);

		code = new JLabel("  ");
		code.setFont(new Font("Baskerville", Font.BOLD, 22));
		code.setBounds(244, 484, 456, 36);
		frame.getContentPane().add(code); 
		
		GO = new JButton("GO");
		GO.setFont(new Font("Kokonor", Font.BOLD, ٢٠));
		GO.setForeground(new Color(0, 0, 0));
		GO.setBounds(729, 635, 89, 48);
		frame.getContentPane().add(GO);
		GO.setOpaque(false);
		GO.setContentAreaFilled(false);
		GO.setBorderPainted(false);
		
		back= new JButton(" << ");
		back.setOpaque(false);
		back.setForeground(Color.BLACK);
		back.setFont(new Font("Kokonor", Font.BOLD, ٢٠));
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);
		back.setBounds(105, 635, 89, 48);
		frame.getContentPane().add(back);
		
		JLabel Label = new JLabel("  ");
		Label.setIcon(new ImageIcon("/Users/rawan/Desktop/6.png"));
		Label.setBounds(0, 0, 950, 760);
		frame.getContentPane().add(Label);
		
		JButton Button = new JButton("  ");
		Button.setBounds(394, 400, 125, 41);
		frame.getContentPane().add(Button);
		
		
		GO.addActionListener(new ActionListener() 
		{
			Border border = BorderFactory.createLineBorder(Color.RED, 4);
			public void actionPerformed(ActionEvent e) 
			{
				
				if(code_1.getText().equals(""))
					{code_1.setBorder(border);}
				
				if(code_2.getText().equals(""))
					{code_2.setBorder(border);}
				
				if(code_3.getText().equals(""))
					{code_3.setBorder(border);}
				
				if(code_4.getText().equals(""))
					{code_4.setBorder(border);}
					
				else
				{
					new_password x = new new_password();
	        		x.frame.setVisible(true);
	        		frame.dispose();	
				}
			}
			
		});
		
		back.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				ENTRY x = new ENTRY();
        		x.frame2.setVisible(true);
        		frame.dispose();
			}
		});
		
		Button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String check_number = "[0-9]+";
				if(number.getText().length() == 10 && number.getText().matches(check_number))
				{
					code.setText("We send code to your phone enter it here");
					digits.setText(" ");
				}
				else
				{
					digits.setText("The phone number must be 10 digits");
				    code.setText(" ");
				}
				
			}
		});			
	}
}
