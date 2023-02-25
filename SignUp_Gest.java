import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUp_Gest 
{

    JFrame frame5;
    Connection conn;
    PreparedStatement stat;
	private JTextField First_name;
	private JTextField City;
	private JTextField number;
	private JTextField Username;
	private JTextField Civil_Registry;
	private JTextField Male;
	private JTextField Email1;
	private JTextField Password;
	private JTextField Neighborhood;
	private JTextField LastName;
	private JTextField Female;
	private JCheckBox chck_1;
	private JCheckBox chck_2;
	private JButton Button1;
	private JButton Button2;
	
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run()
			{
				try 
				{
					SignUp_Gest window = new SignUp_Gest();
					window.frame5.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public SignUp_Gest()
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
            JOptionPane.showMessageDialog( frame5, ex.getMessage());
        }    
	}
	
	public void addGest()
	{
        try
        {
        	String Name_U = First_name.getText();
            int ID_U = Integer.parseInt(Civil_Registry.getText());
            String Email = Email1.getText();
            String phone_N = number.getText();
            String pass_U = Password.getText();
            String Address_City = City.getText();
            String Address_Neighborhood = Neighborhood.getText();

            stat = conn.prepareStatement("INSERT INTO The_user (Name_U , ID_U , Email , phone_N , pass_U , Address_City , Address_Neighborhood) VALUES (?,?,?,?,?,?,?)");
            stat.setString(1, Name_U);
            stat.setInt(2, ID_U);
            stat.setString(3, Email);
            stat.setString(4, phone_N);
            stat.setString(5, pass_U);
            stat.setString(6, Address_City);
            stat.setString(7, Address_Neighborhood);
            int result1 = stat.executeUpdate();



            if(result1 > 0 )
            {
                JOptionPane.showMessageDialog( frame5 , "The Gest has been added successfully");
                Categories x = new Categories();
        		x.frame9.setVisible(true);
        		frame5.dispose();
                
            }
        }
    
     catch(SQLException ex)
     {
         JOptionPane.showMessageDialog( frame5 , ex.getMessage());
     }
 }

	private void initialize() 
	{
		frame5 = new JFrame();
		frame5.setSize(780,800);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.getContentPane().setLayout(null);
		frame5.setLocationRelativeTo(null);
		
		First_name = new JTextField("First name");
		First_name.setFont(new Font("AppleMyungjo", Font.BOLD, ١٦));
		First_name.setBounds(170, 123, 147, 26);
		frame5.getContentPane().add(First_name);
		First_name.setBackground(new Color(0, 0, 0, 0));
		First_name.setColumns(10);
		
		City = new JTextField();
		City.setFont(new Font("AppleMyungjo", Font.BOLD, ١٧));
		City.setText("City");
		City.setColumns(10);
		City.setBounds(170, 215, 147, 26);
		City.setBackground(new Color(0, 0, 0, 0));
		frame5.getContentPane().add(City);
		
		number = new JTextField();
		number.setFont(new Font("AppleMyungjo", Font.BOLD, ١٧));
		number.setText("Phone number");
		number.setColumns(10);
		number.setBounds(170, 320, 147, 26);
		number.setBackground(new Color(0, 0, 0, 0));
		frame5.getContentPane().add(number);
		
		Username = new JTextField();
		Username.setFont(new Font("AppleMyungjo", Font.BOLD, ١٧));
		Username.setText("Username");
		Username.setColumns(10);
		Username.setBounds(170, 438, 147, 26);
		Username.setBackground(new Color(0, 0, 0, 0));
		frame5.getContentPane().add(Username);
		
		Civil_Registry = new JTextField();
		Civil_Registry.setFont(new Font("AppleMyungjo", Font.BOLD, ١٧));
		Civil_Registry.setText("Civil Registry");
		Civil_Registry.setColumns(10);
		Civil_Registry.setBounds(170, 559, 147, 26);
		Civil_Registry.setBackground(new Color(0, 0, 0, 0));
		frame5.getContentPane().add(Civil_Registry);
		
		Password = new JTextField();
		Password.setFont(new Font("AppleMyungjo", Font.BOLD, ١٧));
		Password.setText("Password");
		Password.setColumns(10);
		Password.setBounds(471, 438, 147, 26);
		Password.setBackground(new Color(0, 0, 0, 0));
		frame5.getContentPane().add(Password);
		
		Email1 = new JTextField();
		Email1.setFont(new Font("AppleMyungjo", Font.BOLD, ١٧));
		Email1.setText("Email");
		Email1.setColumns(10);
		Email1.setBounds(471, 320, 147, 36);
		Email1.setBackground(new Color(0, 0, 0, 0));
		frame5.getContentPane().add(Email1);
		
		Neighborhood = new JTextField();
		Neighborhood.setFont(new Font("AppleMyungjo", Font.BOLD, ١٧));
		Neighborhood.setText("Neighborhood");
		Neighborhood.setColumns(10);
		Neighborhood.setBounds(471, 215, 147, 36);
		Neighborhood.setBackground(new Color(0, 0, 0, 0));
		frame5.getContentPane().add(Neighborhood);
		
		LastName = new JTextField();
		LastName.setFont(new Font("AppleMyungjo", Font.BOLD, ١٧));
		LastName.setText("Last name");
		LastName.setColumns(10);
		LastName.setBounds(471, 122, 147, 27);
		LastName.setBackground(new Color(0, 0, 0, 0));
		frame5.getContentPane().add(LastName);
		
		Male = new JTextField();
		Male.setHorizontalAlignment(SwingConstants.RIGHT);
		Male.setFont(new Font("AppleMyungjo", Font.BOLD, ١٥));
		Male.setText("Male");
		Male.setColumns(10);
		Male.setBackground(new Color(0, 0, 0, 0));
		Male.setBounds(458, 547, 57, 26);
		frame5.getContentPane().add(Male);
		
		Female = new JTextField();
		Female.setFont(new Font("AppleMyungjo", Font.BOLD, ١٥));
		Female.setText("Female");
		Female.setColumns(10);
		Female.setBackground(new Color(0, 0, 0, 0));
		Female.setBounds(555, 547, 85, 26);
		frame5.getContentPane().add(Female);
		
		chck_1 = new JCheckBox("");
		chck_1.setBounds(491, 585, 28, 23);
		frame5.getContentPane().add(chck_1);
		
		chck_2 = new JCheckBox("");
		chck_2.setBounds(585, 585, 34, 23);
		frame5.getContentPane().add(chck_2);
		
		JLabel digits1 = new JLabel("  ");
		digits1.setForeground(new Color(128, 0, 0));
		digits1.setFont(new Font("Baskerville", Font.BOLD, ١٥));
		digits1.setBounds(105, 362, 307, 16);
		frame5.getContentPane().add(digits1);
		
		JLabel digits2 = new JLabel("  ");
		digits2.setForeground(new Color(128, 0, 0));
		digits2.setFont(new Font("Baskerville", Font.BOLD, ١٥));
		digits2.setBounds(122, 597, 307, 16);
		frame5.getContentPane().add(digits2);
		
		JLabel Label = new JLabel(" ");
		Label.setIcon(new ImageIcon("/Users/rawan/Desktop/5.png"));
		Label.setBounds(0, 0, 794, 772);
		frame5.getContentPane().add(Label);
		
		Button1 = new JButton("      ");
		Button1.setBounds(212, 687, 117, 29);
		frame5.getContentPane().add(Button1);
		
		Button2 = new JButton("      ");  
		Button2.setBounds(446, 687, 117, 29);
		frame5.getContentPane().add(Button2);
		
		Button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				GESTS x = new GESTS();
        		x.frame4.setVisible(true);
        		frame5.dispose();
			}
		});
		
		Button2.addActionListener(new ActionListener() 
		{	
			    String check_number = "[0-9]+";
				Border border = BorderFactory.createLineBorder(Color.RED, 4);
				public void actionPerformed(ActionEvent e) 
				{	
					if (First_name.getText().equals("First name"))
					{
						First_name.setBorder(border);
					}
					if (City.getText().equals("City"))
					{
						City.setBorder(border);
					}
					if (number.getText().equals("Phone number") || !(number.getText().length() == 10 && number.getText().matches(check_number)))
					{
						number.setBorder(border);
						digits1.setText("The phone number must be 10 digits");
						
					}
					if (Username.getText().equals("Username"))
					{
						Username.setBorder(border);
					}
					if (Civil_Registry.getText().equals("Civil Registry") || !(number.getText().length() == 10 && number.getText().matches(check_number)))
					{
						Civil_Registry.setBorder(border);
						digits2.setText("The Civil Registry must be 10 digits");
					}
					if (LastName.getText().equals("Last name"))
					{
						LastName.setBorder(border);
					}
					if (Neighborhood.getText().equals("Neighborhood"))
					{
						Neighborhood.setBorder(border);
					}
					if (Email1.getText().equals("Email"))
					{
						Email1.setBorder(border);
					}
					if (Password.getText().equals("Password"))
					{
						Password.setBorder(border);
					}
					
					else
					{
						addGest();
						
		               
		        		
					}
					
				}
				
		});
		
	}
}
