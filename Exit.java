import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Exit {

	 JFrame frame;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try 
				{
					Exit window = new Exit();
					window.frame.setVisible(true);
				}
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	 
	public Exit() 
	{
		initialize();
	}

	
	private void initialize() 
	{
		frame = new JFrame();
		frame.setSize(740,730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel Label = new JLabel(" ");
		Label.setIcon(new ImageIcon("/Users/rawan/Desktop/EX.png"));
		Label.setBounds(6, 6, 788, 686);
		frame.getContentPane().add(Label);
		
		
		JButton Button = new JButton("  ");
		Button.setBounds(56, 491, 117, 29);
		frame.getContentPane().add(Button);
		Button.setOpaque(false);
		Button.setContentAreaFilled(false);
		Button.setBorderPainted(false);
		
		
		Button.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{	
					 System.exit(0);	
				}
			});
	}
}
