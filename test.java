import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



import java.awt.Font;
import javax.swing.JScrollPane;

public class test {

	 JFrame frame;
	 private JTextField case_ID;
	 private JTextField Case_name;
	 private JTextField Plaintiff;
	 private JTextField Defendant;
	 private JTextField  Evidence;
	 private JTextField Date;
	 private JTable table;
	 private JScrollPane scrollPane;
	 Statement pst = null; 
	 ResultSet rs = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public test() 
	{
		initialize();
		
	}
	
	private void initialize() 
	{
		Connection con;
	
	
		frame = new JFrame();
		frame.setSize(900,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
	    case_ID = new JTextField();
	    case_ID.setBounds(107, 495, 193, 37);
		frame.getContentPane().add(case_ID);
		case_ID.setColumns(10);
		case_ID.setBackground(new Color(0, 0, 0, 0));
		
		
		Case_name  = new JTextField();
		Case_name.setColumns(10);
		Case_name.setBounds(373, 495, 193, 37);
		frame.getContentPane().add(Case_name);
		Case_name.setBackground(new Color(0, 0, 0, 0));
		
		Plaintiff = new JTextField(); 
		Plaintiff.setColumns(10);
		Plaintiff.setBounds(625, 495, 193, 37);
		frame.getContentPane().add(Plaintiff);
		Plaintiff.setBackground(new Color(0, 0, 0, 0));
		
		Defendant = new JTextField();
		Defendant.setColumns(10);
		Defendant.setBounds(107, 610, 193, 37);
		frame.getContentPane().add(Defendant);
		Defendant.setBackground(new Color(0, 0, 0, 0));
		
		 Evidence = new JTextField();
		 Evidence.setColumns(10);
		 Evidence.setBounds(373, 610, 193, 37);
		 frame.getContentPane().add( Evidence);
		 Evidence.setBackground(new Color(0, 0, 0, 0));
		
		 Date = new JTextField();
		 Date.setColumns(10);
		 Date.setBounds(625, 610, 193, 37);
		 frame.getContentPane().add(Date);
		 Date.setBackground(new Color(0, 0, 0, 0));
		 
		 scrollPane = new JScrollPane();
		 scrollPane.setBounds(145, 60, 613, 337);
		 frame.getContentPane().add(scrollPane);
		
		 table = new JTable();
		 scrollPane.setViewportView(table);
		 table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		 table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"case_id", "case_name", "pL_name", "D_name", "Evidence", "c_date"
				}
			));
		 
			
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setIcon(new ImageIcon("/Users/rawan/Desktop/21.png"));
		lblNewLabel.setBounds(0, 6, 907, 766);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Update = new JButton(" ");
		Update.setBounds(231, 689, 132, 58);
		frame.getContentPane().add(Update);
		
		JButton Delete = new JButton("  ");
		Delete.setBounds(391, 689, 132, 58);
		frame.getContentPane().add(Delete);
		
		JButton More = new JButton("  ");
		More.setBounds(550, 689, 132, 58);
		frame.getContentPane().add(More);
		
		JButton bc = new JButton("  ");
		bc.setBounds(0, 723, 79, 49);
		frame.getContentPane().add(bc);
		
		try 
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alaali","root", "root1111");
			pst = con.createStatement();
			rs = pst.executeQuery("SELECT * FROM alaali.cases");
			java.sql.ResultSetMetaData rsm = rs.getMetaData();
			int n = rsm.getColumnCount();
			DefaultTableModel dtm = (DefaultTableModel) table.getModel();
			dtm.setRowCount(0);
			while(rs.next())
			{
				Vector<String> v = new Vector<String>();
				for(int i = 1 ; i <= n ; i++)
				{
					v.add(rs.getString("case_id"));
					v.add(rs.getString("case_name"));
					v.add(rs.getString("pL_name"));
					v.add(rs.getString("D_name"));
					v.add(rs.getString("Evidence"));
					v.add(rs.getString("c_date"));	
				}
				dtm.addRow(v);
				
			}
			
		}
		
		catch(Exception e ) 
		{
			e.printStackTrace();
		}
		
		Update.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e1)
			{
				
				
				           try 
							{
				        	   String sql = "UPDATE `cases` SET `case_name` =  '"+ Case_name.getText() + "', `PL_name` =  '"+ Plaintiff.getText()+ "', `D_name` =  '"+Defendant.getText()+"', `Evidence` =  '"+Evidence.getText()+"', `c_date` = '"+Date.getText()+
									      "' WHERE  `case_id` = '" +case_ID.getText()+"'";
						         pst.executeUpdate(sql);
								Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alaali","root", "root1111");
								pst = con.createStatement();
								rs = pst.executeQuery("SELECT * FROM alaali.cases");
								java.sql.ResultSetMetaData rsm = rs.getMetaData();
								int n = rsm.getColumnCount();
								
								
								DefaultTableModel dtm = (DefaultTableModel) table.getModel();
								dtm.setRowCount(0);
								while(rs.next())
								{
									Vector<String> v = new Vector<String>();
									for(int i = 1 ; i <= n ; i++)
									{
										v.add(rs.getString("case_id"));
										v.add(rs.getString("case_name"));
										v.add(rs.getString("pL_name"));
										v.add(rs.getString("D_name"));
										v.add(rs.getString("Evidence"));
										v.add(rs.getString("c_date"));	
									}
									dtm.addRow(v);
									
								}
								
							}
							
							catch(Exception e ) 
							{
								e.printStackTrace();
							}  
				           
				
			}
		});
		
		Delete.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e1)
			{
				 
				String query= "DELETE FROM alaali.cases WHERE case_id = " + case_ID.getText();
				executeSQlQuery(query,"The code has been removed from the data base");
				try 
				{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alaali","root", "root1111");
					pst = con.createStatement();
					rs = pst.executeQuery("SELECT * FROM alaali.cases");
					java.sql.ResultSetMetaData rsm = rs.getMetaData();
					int n = rsm.getColumnCount();
					DefaultTableModel dtm = (DefaultTableModel) table.getModel();
					dtm.setRowCount(0);
					while(rs.next())
					{
						Vector<String> v = new Vector<String>();
						for(int i = 1 ; i <= n ; i++)
						{
							v.add(rs.getString("case_id"));
							v.add(rs.getString("case_name"));
							v.add(rs.getString("pL_name"));
							v.add(rs.getString("D_name"));
							v.add(rs.getString("Evidence"));
							v.add(rs.getString("c_date"));	
						}
						dtm.addRow(v);
						
					}
					
				}
				
				catch(Exception e ) 
				{
					e.printStackTrace();
				}
			}
		});
		
		More.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				MORE_Q x = new MORE_Q();
        		x.frame.setVisible(true);
        		frame.dispose();
			}
		});
		
		bc.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				cases x = new cases();
        		x.frame.setVisible(true);
        		frame.dispose();
			}
		});
		
        table.addMouseListener(new MouseAdapter()
        {
			public void mouseClicked(MouseEvent e)
			{	
				int i =	table.getSelectedRow();
				TableModel model= table.getModel();
				case_ID.setText(model.getValueAt(i, 0).toString());	
				Case_name.setText(model.getValueAt(i, 1).toString());	
				Plaintiff.setText(model.getValueAt(i, 2).toString());	
				Defendant.setText(model.getValueAt(i, 3).toString());	
				Evidence.setText(model.getValueAt(i, 4).toString());	
				Date.setText(model.getValueAt(i, 5).toString());	
				
			}
		});
		
	}

	public void executeSQlQuery(String query,String message) 
	{
		
		Statement st;
		
     try 
     {
    	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alaali","root", "root1111");
    	 st = con.createStatement();
    	 
    	 if (st.executeUpdate(query) == 1)
    	 {
             DefaultTableModel model =(DefaultTableModel)table.getModel();
    	     model.getRowCount();
    		 JOptionPane.showMessageDialog(null,"Data"+message+"Succefully");}
         else 
    		 JOptionPane.showMessageDialog(null," Not Data"+message);

    	 
     }catch(Exception ex) {
	    	ex.printStackTrace();}
     }
}