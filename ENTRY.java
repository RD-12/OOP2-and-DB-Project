import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ENTRY 
{

	 JFrame frame2;

	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run()
			{
				try 
				{
					ENTRY window = new ENTRY();
					window.frame2.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public ENTRY() 
	{
		initialize();
	}

	private void initialize()
	 {
		frame2 = new JFrame();
		frame2.setSize(1200,700);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		frame2.setLocationRelativeTo(null);
		
		JButton Lawyer = new JButton("   ");
		Lawyer.setBounds(506, 342, 224, 50);
		frame2.getContentPane().add(Lawyer);
		Lawyer.setOpaque(false);
		Lawyer.setContentAreaFilled(false);
		Lawyer.setBorderPainted(false);
		
		JButton Guest = new JButton("   ");
		Guest.setBounds(506, 458, 224, 50);
		frame2.getContentPane().add(Guest);
		Guest.setOpaque(false);
		Guest.setContentAreaFilled(false);
		Guest.setBorderPainted(false);
		
		JButton Exit = new JButton("   ");
		Exit.setBounds(506, 572, 224, 50);
		frame2.getContentPane().add(Exit);
		Exit.setOpaque(false);
		Exit.setContentAreaFilled(false);
		Exit.setBorderPainted(false);
		
		JLabel Label = new JLabel("New label");
		Label.setIcon(new ImageIcon("/Users/rawan/Desktop/2.JPG"));
		Label.setBounds(-16, 0, 1216, 682);
		frame2.getContentPane().add(Label);
		
		
		Lawyer.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				LAWYERS x = new LAWYERS();
        		x.frame3.setVisible(true);
        		frame2.dispose();
        		
				
			}
		});
		
		Guest.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				GESTS x = new GESTS();
        		x.frame4.setVisible(true);
        		frame2.dispose();
				
			}
		});
		
		Exit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Exit x = new Exit();
        		x.frame.setVisible(true);
        		frame2.dispose();		
			}
		});
	}

}
