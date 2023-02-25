import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class success 
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
					success window = new success();
					window.frame.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	public success() 
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
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setIcon(new ImageIcon("/Users/rawan/Desktop/٧.png"));
		lblNewLabel.setBounds(6, 6, 918, 780);
		frame.getContentPane().add(lblNewLabel);
		
		JButton ok = new JButton(" ");
		ok.setBounds(432, 572, 87, 68);
		frame.getContentPane().add(ok);
		
		ok.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
        		ENTRY x = new ENTRY();
        		x.frame2.setVisible(true);
        		frame.dispose();
				
			}
		});
	}

}
