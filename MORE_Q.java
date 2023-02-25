import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MORE_Q {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MORE_Q window = new MORE_Q();
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
	public MORE_Q() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setSize(900,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/rawan/Desktop/23.png"));
		lblNewLabel.setBounds(0, 6, 1118, 860);
		frame.getContentPane().add(lblNewLabel);
		
		JButton video_evidence = new JButton("New button");
		video_evidence.setBounds(211, 108, 646, 97);
		frame.getContentPane().add(video_evidence);
		
		JButton  number_of_lawyers = new JButton("New button");
		number_of_lawyers.setBounds(233, 323, 646, 97);
		frame.getContentPane().add(number_of_lawyers);
		
		JButton bc = new JButton("New button");
		bc.setBounds(233, 537, 646, 97);
		frame.getContentPane().add(bc);
		
		video_evidence.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				video_evidence x = new video_evidence();
    		    x.frame.setVisible(true);
    		    frame.dispose();
				
			}
		});
		
		number_of_lawyers.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				number_of_lawyers x = new number_of_lawyers();
				x.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		
		bc.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				test x = new test();
        		x.frame.setVisible(true);
        		frame.dispose();
			}
		});
	}
}
