package Phone_Directory;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Update_Contact extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String name) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_Contact frame = new Update_Contact(name);
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
	public Update_Contact(String name) {
		Contact updatecontact = Contact_Dictionary.contact.get(name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("DETAILS OF " + name);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 24));
		lblNewLabel.setBounds(142, 69, 329, 37);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Phone Number: ");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		lblNewLabel_1.setBounds(173, 140, 132, 12);
		contentPane.add(lblNewLabel_1);

		JLabel lblphone = new JLabel("");
		lblphone.setBackground(Color.WHITE);
		lblphone.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		lblphone.setText(updatecontact.getMobile());
		lblphone.setBounds(318, 140, 230, 13);
		contentPane.add(lblphone);

		JLabel lblNewLabel_2 = new JLabel("Address: ");
		lblNewLabel_2.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		lblNewLabel_2.setBounds(214, 178, 60, 13);
		contentPane.add(lblNewLabel_2);

		JLabel lbladdress = new JLabel("");
		lbladdress.setBackground(Color.WHITE);
		lbladdress.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		lbladdress.setText(updatecontact.getAddress());
		lbladdress.setBounds(320, 178, 151, 13);
		contentPane.add(lbladdress);

		JLabel lblNewLabel_3 = new JLabel("Email Id: ");
		lblNewLabel_3.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		lblNewLabel_3.setBounds(214, 214, 60, 13);
		contentPane.add(lblNewLabel_3);

		JLabel lblemailid = new JLabel("");
		lblemailid.setBackground(Color.WHITE);
		lblemailid.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		lblemailid.setText(updatecontact.getEmail());
		lblemailid.setBounds(321, 206, 169, 29);
		contentPane.add(lblemailid);

		JButton btnNewButton = new JButton("EDIT PHONE NO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_Phone.main(name);
			}
		});
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 10));
		btnNewButton.setBounds(56, 280, 139, 21);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("EDIT ADDRESS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_Address.main(name);
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 10));
		btnNewButton_1.setBounds(241, 280, 132, 21);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("EDIT EMAIL ID");
		btnNewButton_1_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 10));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_Email.main(name);
			}
		});
		btnNewButton_1_1.setBounds(416, 280, 132, 21);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFunctions.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		btnNewButton_2.setBounds(3, 382, 85, 21);
		contentPane.add(btnNewButton_2);
	}
}
