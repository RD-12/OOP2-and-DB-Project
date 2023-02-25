import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Categories 
{
 JFrame frame9;

	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try
				{
					Categories window = new Categories();
					window.frame9.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				} 
			}
		});
	}

	public Categories() 
	{
		initialize();
	}

	
	private void initialize()
	{
		frame9 = new JFrame();
		frame9.setSize(1300,720);
		frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame9.getContentPane().setLayout(null);
		frame9.setLocationRelativeTo(null);
		
		JButton Button = new JButton("      ");
		Button.setBounds(6, 625, 117, 61);
		frame9.getContentPane().add(Button);
		Button.setOpaque(false);
		Button.setContentAreaFilled(false);
		Button.setBorderPainted(false);
		
		JLabel Label = new JLabel("New label");
		Label.setIcon(new ImageIcon("/Users/rawan/Desktop/8.png"));
		Label.setBounds(-18, -12, 1339, 721);
		frame9.getContentPane().add(Label);
		
		JButton personal_status_cases = new JButton("New button");
		personal_status_cases.setBounds(116, 137, 309, 131);
		frame9.getContentPane().add(personal_status_cases);
		
		JButton cybercrime = new JButton("New button");
		cybercrime.setBounds(507, 137, 309, 131);
		frame9.getContentPane().add(cybercrime);
		
		JButton medical_errors = new JButton("New button");
		medical_errors.setBounds(895, 137, 309, 131);
		frame9.getContentPane().add(medical_errors);
		
		JButton legal_assurance_ssues  = new JButton("New button");
		legal_assurance_ssues.setBounds(116, 403, 309, 131);
		frame9.getContentPane().add(legal_assurance_ssues);
		
		JButton trade_issues = new JButton("New button");
		trade_issues.setBounds(507, 403, 309, 131);
		frame9.getContentPane().add(trade_issues);
		
		JButton Tax_cases  = new JButton("New button");
		Tax_cases.setBounds(895, 403, 309, 131);
		frame9.getContentPane().add(Tax_cases);
		
		
	
		
	personal_status_cases.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			personal_status x = new personal_status();
    		x.frame.setVisible(true);
    		frame9.dispose();
			
		}
	});
	cybercrime.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			Cybercrime_cases x = new Cybercrime_cases();
    		x.frame.setVisible(true);
    		frame9.dispose();
		}
	});
	medical_errors.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			medical_Errors x = new medical_Errors();
    		x.frame.setVisible(true);
    		frame9.dispose();
		}
	});
	
	legal_assurance_ssues.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			legal_assurance x = new legal_assurance();
    		x.frame.setVisible(true);
    		frame9.dispose();
			
		}
	});
	trade_issues.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			trade_issues_case x = new trade_issues_case();
    		x.frame.setVisible(true);
    		frame9.dispose();	
		}
	});
	Tax_cases.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			Tax_case x = new Tax_case();
    		x.frame.setVisible(true);
    		frame9.dispose();
		}
	});
	
	Button.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			GESTS x = new GESTS();
    		x.frame4.setVisible(true);
    		frame9.dispose();
		}
	});
}}
