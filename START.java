import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class START
{
	private JFrame frame1;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					START window = new START();
					window.frame1.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public START() 
	{
		initialize();
	}

	
	private void initialize() 
	{
		frame1 = new JFrame();
		frame1.setSize(1200,700);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null); 
		frame1.setLocationRelativeTo(null);
		
		
		JLabel Label = new JLabel("New label");
		Label.setIcon(new ImageIcon("/Users/rawan/Desktop/1.png"));
		Label.setBounds(0, 0, 1200, 672);
		frame1.getContentPane().add(Label);
		
		
		JButton Learn_more = new JButton("         ");
		Learn_more.setBounds(133, 531, 219, 54);
		frame1.getContentPane().add(Learn_more);
		Learn_more.setOpaque(false);
		Learn_more.setContentAreaFilled(false);
		Learn_more.setBorderPainted(false);
		
		
		
		Learn_more.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
        		ENTRY x = new ENTRY();
        		x.frame2.setVisible(true);
        		frame1.dispose();
				
			}
		});
	}
}


