import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class video_evidence {

	 JFrame frame;
	private JTable table;
	 private JScrollPane scrollPane;
	 private JButton ok;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					video_evidence window = new video_evidence();
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
	public video_evidence() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		Connection con;
		frame = new JFrame();
		frame.setSize(900,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/rawan/Desktop/24.png"));
		lblNewLabel.setBounds(-6, -117, 906, 889);
		frame.getContentPane().add(lblNewLabel);
		
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
						"ID_U", "Name_U",
				}
			));
		 
		 ok = new JButton("New button");
		 ok.setBounds(395, 694, 117, 72);
		 frame.getContentPane().add(ok);
		 try 
			{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alaali","root", "root1111");
				Statement pst = con.createStatement();
				ResultSet rs = pst.executeQuery("Select  ID_U , Name_U\n"
						+ "From The_user as U\n"
						+ "Where exists(Select *From cases Where Evidence='video' AND ID_case=ID_U);");
				java.sql.ResultSetMetaData rsm = rs.getMetaData();
				int n = rsm.getColumnCount();
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.setRowCount(0);
				while(rs.next())
				{
					Vector<String> v = new Vector<String>();
					for(int i = 1 ; i <= n ; i++)
					{
						v.add(rs.getString("ID_U"));
						v.add(rs.getString("Name_U"));
						
							
					}
					dtm.addRow(v);
					
				}
				
			}
			
			catch(Exception e ) 
			{
				e.printStackTrace();
			}
	
	ok.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e)
		{
			MORE_Q x = new MORE_Q();
    		x.frame.setVisible(true);
    		frame.dispose();
		}
	});
	
	
	}
}
