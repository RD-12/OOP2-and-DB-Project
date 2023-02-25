import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;

public class add_cases 
{

	 JFrame frame;
	 private JTextField namecass;
	 private JTextField P_Name;
	 private JTextField DL_name;
	 private JTextField IDcass;
	 private JTextField Date;
	 private JTextField EV;
	 Connection conn;
	 PreparedStatement stat;

	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()   
		{
			 
			public void run()
			{
				try 
				{
					add_cases window = new add_cases();
					window.frame.setVisible(true);
				} 
				
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	public add_cases()
	{
		initialize();
		connectDB();
	}
	private void connectDB()
	{
        String URL = "jdbc:mysql://localhost:3306/alaali";
        String username = "root";
        String password = "root1111";
        
        try
        {
            conn = DriverManager.getConnection(URL , username , password);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog( frame, ex.getMessage());
        }    
    }
	public void addCase(){
        try{
         String case_name = namecass.getText();
         int case_id = Integer.parseInt(IDcass.getText());
         String pL_name = P_Name.getText();
         String c_date = Date.getText();
         String D_name = DL_name.getText();
         String Evidence = EV.getText();

         stat = conn.prepareStatement("INSERT INTO cases (case_id, case_name, pL_name, D_name, Evidence ,c_date) VALUES (?,?,?,?,?,?)");
         stat.setInt(1, case_id);
         stat.setString(2, case_name);
         stat.setString(3, pL_name);
         stat.setString(4, D_name);
         stat.setString(5, Evidence);
         stat.setString(6, c_date);
         int result1 = stat.executeUpdate();



         if(result1 > 0 )
         {
             JOptionPane.showMessageDialog( frame, "The Case has been added successfully");

             namecass.setText("");
             IDcass.setText("");
             P_Name.setText("");
             Date.setText("");
             DL_name.setText("");
             EV.setText("");
         }
     }
     catch(SQLException ex)
     {
         JOptionPane.showMessageDialog( frame, ex.getMessage());
     }
 }

	
	private void initialize() 
	{
		frame = new JFrame();
		frame.setSize(835,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		namecass = new JTextField();
		namecass.setFont(new Font("Times New Roman", Font.BOLD, ١٥));
		namecass.setBounds(232, 168, 171, 26);
		frame.getContentPane().add(namecass);
		namecass.setColumns(10);
		
		P_Name = new JTextField();
		P_Name.setColumns(10);
		P_Name.setBounds(270, 306, 171, 26);
		frame.getContentPane().add(P_Name);
		
		DL_name = new JTextField();
		DL_name.setColumns(10);
		DL_name.setBounds(253, 458, 171, 26);
		frame.getContentPane().add(DL_name);
		
		IDcass = new JTextField();
		IDcass.setColumns(10);
		IDcass.setBounds(608, 168, 171, 26);
		frame.getContentPane().add(IDcass);
		
		Date = new JTextField();
		Date.setColumns(10);
		Date.setBounds(634, 306, 171, 26);
		frame.getContentPane().add(Date);
		Date.setToolTipText("Example: 2022-12-15");
		
		EV = new JTextField();
		EV.setColumns(10);
		EV.setBounds(634, 458, 171, 26);
		frame.getContentPane().add(EV);
		
		JLabel lblNewLabel = new JLabel("  ");
		lblNewLabel.setIcon(new ImageIcon("/Users/rawan/Desktop/17.png"));
		lblNewLabel.setBounds(6, 6, 838, 680);
		frame.getContentPane().add(lblNewLabel);
		
		JButton addcase = new JButton("  ");
		addcase.setBounds(55, 614, 117, 36);
		frame.getContentPane().add(addcase);
		
		JButton back = new JButton("  ");
		back.setBounds(725, 594, 54, 56);
		frame.getContentPane().add(back);
		
		
		
		back.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				cases x = new cases();
				x.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		addcase.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				addCase();
				
			}
		});
		
	}
}
