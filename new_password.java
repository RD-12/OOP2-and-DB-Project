import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class new_password
{

	 JFrame frame;
	 private JTextField textField;
	 private JTextField textField_1;
	 int count = 0;
	 boolean x;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					new_password window = new new_password();
					window.frame.setVisible(true);
				} 
				
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	public new_password() 
	{
		initialize();
	}

	
	private void initialize()
	{
		frame = new JFrame();
		frame.setSize(930,820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		textField = new JPasswordField();
		textField.setBounds(446, 302, 265, 35);
		textField.setBackground(new Color(0, 0, 0, 0));
		textField.setFont(new Font("Baskerville", Font.BOLD, 18));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(446, 410, 265, 35);
		textField_1.setBackground(new Color(0, 0, 0, 0));
		textField_1.setFont(new Font("Baskerville", Font.BOLD, 18));
		frame.getContentPane().add(textField_1);
		
		JLabel code = new JLabel("  ");
		code.setForeground(new Color(128, 0, 0));
		code.setFont(new Font("Baskerville", Font.BOLD, ١٥));
		code.setBounds(230, 457, 456, 36);
		frame.getContentPane().add(code);
		
		JLabel code1 = new JLabel("  ");
		code1.setForeground(new Color(128, 0, 0));
		code1.setFont(new Font("Baskerville", Font.BOLD, ١٥));
		code1.setBounds(230, 485, 456, 36);
		frame.getContentPane().add(code1);
		
		JLabel code2 = new JLabel("  ");
		code2.setForeground(new Color(128, 0, 0));
		code2.setFont(new Font("Baskerville", Font.BOLD, ١٥));
		code2.setBounds(230, 545, 456, 36);
		frame.getContentPane().add(code2);
		
		JLabel code3 = new JLabel("  ");
		code3.setForeground(new Color(128, 0, 0));
		code3.setFont(new Font("Baskerville", Font.BOLD, ١٥));
		code3.setBounds(230, 517, 456, 36);
		code3.setForeground(new Color(128, 0, 0));
		frame.getContentPane().add(code3);
		
		JLabel code4 = new JLabel("  ");
		code4.setForeground(new Color(128, 0, 0));
		code4.setFont(new Font("Baskerville", Font.BOLD, ١٥));
		code4.setBounds(230, 457, 456, 36);
		frame.getContentPane().add(code4);
		
		JLabel Label = new JLabel("  ");
		Label.setIcon(new ImageIcon("/Users/rawan/Desktop/7.png"));
		Label.setBounds(6, -91, 918, 966);
		frame.getContentPane().add(Label);
		
		JButton Button1 = new JButton("  ");
		Button1.setBounds(740, 613, 92, 94);
		frame.getContentPane().add(Button1);
		
		JButton Button2 = new JButton("   ");
		Button2.setBounds(103, 613, 92, 94);
		frame.getContentPane().add(Button2);
		
		JButton Button3 = new JButton("  ");
		Button3.setBounds(717, 307, 27, 29);
		frame.getContentPane().add(Button3);
		
		JButton Button4 = new JButton("");
		Button4.setBounds(717, 415, 27, 29);
		frame.getContentPane().add(Button4);
		
		
		
		Button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				for (int i = 0 ; i < textField.getText().length() ; i++)
					if (!Character.isLetter(textField.getText().charAt(i)) 
							&& !Character.isDigit(textField.getText().charAt(i)))
						x = false;

					if (textField.getText().length() < 8)
						x = false;
					
				for (int i = 0 ; i < textField.getText().length() ; i++)
					if (Character.isDigit(textField.getText().charAt(i)))
					   count++;	

				    if (count >= 2)
				       x = true;

				    else
					   x = false;
				     
				    if(x == true)
					   {
				    	 
					    	if(textField.getText().equals(textField_1.getText()))
					    	{
					    		code4.setText("  ");
					    		success x = new success();
				        		x.frame.setVisible(true);
				        		frame.dispose();
					    	}
					    	else
					    	{
					    		code4.setText("Password and Re-password don't match, try again. ");
					    		code.setText("  ");
						    	code1.setText("  ");
						    	code2.setText("  ");
						    	code3.setText(" ");
					    	}	
					   }
				    if(x == false)
						{
				    	code.setText("Incorrect password. ");
				    	code1.setText("-Password must contain letters");
				    	code2.setText("-Password must contain at least two numbers");
				    	code3.setText("-Password must be greater than or equal to eight");				
						}
	
					
			}
		});
		
		Button2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Forgot_password x = new Forgot_password();
        		x.frame.setVisible(true);
        		frame.dispose();		
			}
		});
		
		Button3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			  ((JPasswordField) textField).setEchoChar((char)0);	
			}
		});
		
		Button4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			  ((JPasswordField) textField_1).setEchoChar((char)0);	
				
			}
		});
	}
}
