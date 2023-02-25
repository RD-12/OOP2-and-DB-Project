import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GESTS 
{

    JFrame frame4;

	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try
				{
					LAWYERS window = new LAWYERS();
					window.frame3.setVisible(true);
				}
				
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public GESTS() 
	{
		initialize();
	}

	private void initialize()
	{
		frame4 = new JFrame();
		frame4.setSize(1150,680);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		frame4.setLocationRelativeTo(null);
		
		JTextField username = new JTextField();
		username.setBounds(533, 205, 244, 29);
		frame4.getContentPane().add(username);
		username.setColumns(10);
		username.setBackground(new Color(0, 0, 0, 0));
		username.setFont(new Font("Serif",Font.ITALIC + Font.BOLD ,22));
		
		JTextField Password = new JPasswordField();
		Password.setBounds(533, 280, 244, 29);
		frame4.getContentPane().add(Password);
		Password.setColumns(10);
		Password.setBackground(new Color(0, 0, 0, 0));
		Password.setFont(new Font("Serif",Font.ITALIC + Font.BOLD ,22));
		
		
		
		JButton Sign_Up = new JButton("    ");
		Sign_Up.setBounds(608, 414, 107, 29);
		frame4.getContentPane().add(Sign_Up);
		Sign_Up.setOpaque(false);
		Sign_Up.setContentAreaFilled(false);
		Sign_Up.setBorderPainted(false);
		
		JButton Forgot_password = new JButton("    ");
		Forgot_password.setBounds(710, 328, 186, 29);
		frame4.getContentPane().add(Forgot_password);
		Forgot_password.setOpaque(false);
		Forgot_password.setContentAreaFilled(false);
		Forgot_password.setBorderPainted(false);
		
		JLabel label = new JLabel("  ");
		label.setIcon(new ImageIcon("/Users/rawan/Desktop/3.png"));
		label.setBounds(-44, 0, 1194, 682);
		frame4.getContentPane().add(label);
		
		JButton back = new JButton("   ");
		back.setBounds(597, 452, 117, 29);
		frame4.getContentPane().add(back);
		
		JButton login = new JButton("  ");
		login.setBounds(598, 373, 117, 29);
		frame4.getContentPane().add(login);
		
		login.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(username.getText().length() >= 8 && Password.getText().length() >= 8)
				{
					Categories x = new Categories();
	        		x.frame9.setVisible(true);
	        		frame4.dispose();
				}
				
				else
				{
					Icon icon2 = new ImageIcon(new ImageIcon("1.png").getImage().getScaledInstance(100, 120, Image.SCALE_DEFAULT));
					JOptionPane.showMessageDialog(null,"Incorrect username/password, please try againy",
							" Al.Aali Law Firm ", JOptionPane.INFORMATION_MESSAGE, icon2);
				}
			}
		});
		
		Sign_Up.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				SignUp_Gest x = new SignUp_Gest();
        		x.frame5.setVisible(true);
        		frame4.dispose();
			}
		});
		
		Forgot_password.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Forgot_password x = new Forgot_password();
        		x.frame.setVisible(true);
        		frame4.dispose();		
			}
		});
		
		back.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				ENTRY x = new ENTRY();
        		x.frame2.setVisible(true);
        		frame4.dispose();		
			}
		});
			
	  }
	}

