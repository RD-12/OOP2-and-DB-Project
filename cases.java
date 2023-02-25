import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cases
{

	 JFrame frame;

	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					cases window = new cases();
					window.frame.setVisible(true);
				}
				
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	public cases()
	{
		initialize();
	}

	
	private void initialize()
	{
		frame = new JFrame();
		frame.setSize(950,830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/rawan/Desktop/١٠.png"));
		lblNewLabel.setBounds(6, -38, 955, 883);
		frame.getContentPane().add(lblNewLabel);
		
		JButton new_cases  = new JButton("New button");
		new_cases.setBounds(184, 284, 129, 287);
		frame.getContentPane().add(new_cases);
		
		JButton show_cases = new JButton("  ");
		show_cases.setBounds(561, 284, 206, 317);
		frame.getContentPane().add(show_cases);
		
		JButton back = new JButton("New button");
		back.setBounds(41, 696, 117, 86);
		frame.getContentPane().add(back);
		
		
		new_cases.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				add_cases x = new add_cases();
        		x.frame.setVisible(true);
        		frame.dispose();	
			}
		});
		
		show_cases.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				test x = new test();
        		x.frame.setVisible(true);
        		frame.dispose();
			}
		});
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				LAWYERS x = new LAWYERS();
        		x.frame3.setVisible(true);
        		frame.dispose();
			}
		});
		
		
		
		
		
		
		
		
		
		
	
		
	}
}
