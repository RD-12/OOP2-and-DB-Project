import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUp_Lawyer
{

    JFrame frame;
    Connection conn;
    PreparedStatement stat;
    private JTextField Experience;
	private JTextField name;
	private JTextField City;
	private JTextField number;
	private JTextField Username;
	private JTextField Civil_Registry;
	private JTextField Male;
	private JTextField Email1;
	private JTextField Password;
	private JTextField Neighborhood;
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
					SignUp_Lawyer window = new SignUp_Lawyer(); 
					window.frame.setVisible(true);
				} 
				
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	public SignUp_Lawyer()
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
	
	public void addLawyer(){
        try
        {
        	String Name_L = name.getText();
            int ID_L = Integer.parseInt(Civil_Registry.getText());
            String Email = Email1.getText();
            String phone_N = number.getText();
            String E_Years = Experience.getText();
            String pass_L = Password.getText();
            String Address_City = City.getText();
            String Address_Neighborhood = Neighborhood.getText();

            stat = conn.prepareStatement("INSERT INTO Lawyer (Name_L , ID_L , Email , phone_N , E_Years , pass_L , Address_City , Address_Neighborhood) VALUES (?,?,?,?,?,?,?,?)");
            stat.setString(1, Name_L);
            stat.setInt(2, ID_L);
            stat.setString(3, Email);
            stat.setString(4, phone_N);
            stat.setString(5, E_Years);
            stat.setString(6, pass_L);
            stat.setString(7, Address_City);
            stat.setString(8, Address_Neighborhood);
            int result1 = stat.executeUpdate();



            if(result1 > 0 )
            {
                JOptionPane.showMessageDialog( frame , "The Lawyer has been added successfully");
                cases x = new cases();
	        	x.frame.setVisible(true);
	        	frame.dispose();
               
                
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog( frame , ex.getMessage());
        }
    }
	private void initialize()
	{
		frame = new JFrame();
		frame.setSize(780,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		name = new JTextField("Your name");
		name.setFont(new Font("AppleMyungjo", Font.BOLD, 16));
		name.setBounds(170, 124, 145, 30);
		frame.getContentPane().add(name);
		name.setBackground(new Color(0, 0, 0, 0));
		name.setColumns(10);
		
		City = new JTextField();
		City.setFont(new Font("AppleMyungjo", Font.BOLD, 17));
		City.setText("City");
		City.setColumns(10);
		City.setBounds(170, 215, 145, 36);
		City.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(City);
		
		number = new JTextField();
		number.setFont(new Font("AppleMyungjo", Font.BOLD, 17));
		number.setText("Phone number");
		number.setColumns(10);
		number.setBounds(170, 322, 145, 30);
		number.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(number);
		
		Username = new JTextField();
		Username.setFont(new Font("AppleMyungjo", Font.BOLD, 17));
		Username.setText("Username");
		Username.setColumns(10);
		Username.setBounds(170, 439, 145, 30);
		Username.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(Username);
		
		Experience = new JTextField();
		Experience.setFont(new Font("AppleMyungjo", Font.BOLD,14));
		Experience.setText("Years of Experience");
		Experience.setColumns(10);
		Experience.setBounds(170, 562, 145, 30);
		Experience.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(Experience);
		
		Password = new JTextField();
		Password.setFont(new Font("AppleMyungjo", Font.BOLD, 17));
		Password.setText("Password");
		Password.setColumns(10);
		Password.setBounds(471, 439, 148, 30);
		Password.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(Password);
		
		Email1 = new JTextField();
		Email1.setFont(new Font("AppleMyungjo", Font.BOLD, 17));
		Email1.setText("Email");
		Email1.setColumns(10);
		Email1.setBounds(471, 322, 148, 36);
		Email1.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(Email1);
		
		Neighborhood = new JTextField();
		Neighborhood.setFont(new Font("AppleMyungjo", Font.BOLD, 17));
		Neighborhood.setText("Neighborhood");
		Neighborhood.setColumns(10);
		Neighborhood.setBounds(471, 221, 145, 30);
		Neighborhood.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(Neighborhood);
		
		Civil_Registry = new JTextField();
		Civil_Registry.setFont(new Font("AppleMyungjo", Font.BOLD, 17));
		Civil_Registry.setText("Civil Registry");
		Civil_Registry.setColumns(10);
		Civil_Registry.setBounds(463, 124, 145, 30);
		Civil_Registry.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(Civil_Registry);
		
		Male = new JTextField();
		Male.setHorizontalAlignment(SwingConstants.RIGHT);
		Male.setFont(new Font("AppleMyungjo", Font.BOLD, 15));
		Male.setText("Male");
		Male.setColumns(10);
		Male.setBackground(new Color(0, 0, 0, 0));
		Male.setBounds(471, 547, 57, 41);
		frame.getContentPane().add(Male);
		
		Female = new JTextField();
		Female.setFont(new Font("AppleMyungjo", Font.BOLD, 15));
		Female.setText("Female");
		Female.setColumns(10);
		Female.setBackground(new Color(0, 0, 0, 0));
		Female.setBounds(562, 549, 85, 36);
		frame.getContentPane().add(Female);
		
		chck_1 = new JCheckBox("");
		chck_1.setBounds(491, 585, 28, 23);
		frame.getContentPane().add(chck_1);
		
		chck_2 = new JCheckBox("");
		chck_2.setBounds(585, 585, 34, 23);
		frame.getContentPane().add(chck_2);
		
		JLabel digits1 = new JLabel("  ");
		digits1.setForeground(new Color(128, 0, 0));
		digits1.setFont(new Font("Baskerville", Font.BOLD, ١٥));
		digits1.setBounds(105, 362, 307, 16);
		frame.getContentPane().add(digits1);
		
		JLabel digits2 = new JLabel("  ");
		digits2.setForeground(new Color(128, 0, 0));
		digits2.setFont(new Font("Baskerville", Font.BOLD, ١٥));
		digits2.setBounds(421, 166, 307, 16);
		frame.getContentPane().add(digits2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/rawan/Desktop/4.png"));
		lblNewLabel.setBounds(0, 0, 800, 772);
		frame.getContentPane().add(lblNewLabel);
		
		
		Button1 = new JButton("      ");
		Button1.setBounds(212, 687, 117, 37);
		frame.getContentPane().add(Button1);
		
		Button2 = new JButton("      ");  
		Button2.setFont(new Font("Lucida Grande", Font.PLAIN, ١١));
		Button2.setBounds(446, 687, 117, 37);
		frame.getContentPane().add(Button2);
		
		

		
		Button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				LAWYERS x = new LAWYERS();
        		x.frame3.setVisible(true);
        		frame.dispose();
			}
		});
		
		Button2.addActionListener(new ActionListener() 
		{
		    Border border = BorderFactory.createLineBorder(Color.RED, 4);
		    String check_number = "[0-9]+";
			public void actionPerformed(ActionEvent e) 
			{	
				if (name.getText().equals("Your name"))
				{
					name.setBorder(border);}
				if (City.getText().equals("City"))
				{
					City.setBorder(border);}
				if (number.getText().equals("Phone number") || !(number.getText().length() == 10 && number.getText().matches(check_number)))
				{
					number.setBorder(border);
					digits1.setText("The phone number must be 10 digits");}
				if (Username.getText().equals("Username"))
				{
					Username.setBorder(border);}
				if (Experience.getText().equals("Years of Experience"))
				{
					Experience.setBorder(border);}
				if (Civil_Registry.getText().equals("Civil Registry") || 
						!(number.getText().length() == 10 && number.getText().matches(check_number)))
				{
					Civil_Registry.setBorder(border);
					digits2.setText("The Civil Registry must be 10 digits");}
				if (Neighborhood.getText().equals("Neighborhood"))
				{
					Neighborhood.setBorder(border);}
				if (Email1.getText().equals("Email"))
				{
					Email1.setBorder(border);}
				if (Password.getText().equals("Password"))
				{
					Password.setBorder(border);}
					
				else
				{
					addLawyer();
					
		        	
				}
					
			}
		});
		
		
	}
}