package Phone_Directory;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.DropMode;

public class Insert_Contact extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldname;
	private JTextField textFieldnumber;
	private JTextField textFieldaddress;
	private JTextField textFieldemailid;
	private static String name, number, address, emailid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insert_Contact frame = new Insert_Contact();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Insert_Contact() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("INSERT CONTACT");
		lblNewLabel.setBounds(182, 83, 253, 40);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NAME:");
		lblNewLabel_1.setBounds(194, 128, 62, 20);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 13));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblNewLabel_1);

		textFieldname = new JTextField();
		textFieldname.setDropMode(DropMode.INSERT);
		textFieldname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		textFieldname.setBounds(194, 144, 223, 20);
		contentPane.add(textFieldname);
		textFieldname.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("CONTACT NUMBER:");
		lblNewLabel_2.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(194, 175, 190, 23);
		contentPane.add(lblNewLabel_2);

		textFieldnumber = new JTextField();
		textFieldnumber.setDropMode(DropMode.INSERT);
		textFieldnumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		textFieldnumber.setColumns(10);
		textFieldnumber.setBounds(194, 195, 223, 20);
		contentPane.add(textFieldnumber);

		JLabel lblNewLabel_1_1 = new JLabel("ADDRESS:");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(194, 226, 75, 20);
		contentPane.add(lblNewLabel_1_1);

		textFieldaddress = new JTextField();
		textFieldaddress.setDropMode(DropMode.INSERT);
		textFieldaddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		textFieldaddress.setColumns(10);
		textFieldaddress.setBounds(194, 244, 223, 20);
		contentPane.add(textFieldaddress);

		JLabel lblNewLabel_1_1_1 = new JLabel("EMAIL ID:");
		lblNewLabel_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(194, 275, 75, 20);
		contentPane.add(lblNewLabel_1_1_1);

		textFieldemailid = new JTextField();
		textFieldemailid.setDropMode(DropMode.INSERT);
		textFieldemailid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		textFieldemailid.setColumns(10);
		textFieldemailid.setBounds(194, 294, 223, 20);
		contentPane.add(textFieldemailid);

		JLabel addedlbl = new JLabel("");
		addedlbl.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		addedlbl.setHorizontalAlignment(SwingConstants.CENTER);
		addedlbl.setBounds(254, 391, 142, 13);
		contentPane.add(addedlbl);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = textFieldname.getText();
				number = textFieldnumber.getText();
				address = textFieldaddress.getText();
				emailid = textFieldemailid.getText();
				Contact_Dictionary.insertData(name, number, address, emailid);
				Contact_Dictionary.exportData();
				addedlbl.setText("Contact Added");
			}
		});
		btnNewButton.setBounds(515, 383, 98, 21);
		contentPane.add(btnNewButton);

		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 12));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFunctions.main(null);
			}
		});
		btnBack.setBounds(10, 384, 75, 20);
		contentPane.add(btnBack);

	}
}
