package Phone_Directory;

import java.awt.BorderLayout;
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

public class Delete_Contact extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_Contact frame = new Delete_Contact();
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
	public Delete_Contact() {
		setTitle("Delete_Contact");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("DELETE CONTACT");
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(195, 121, 219, 54);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Enter Name of the Contact to be Deleted: ");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(164, 186, 294, 13);
		contentPane.add(lblNewLabel_1);

		textFieldname = new JTextField();
		textFieldname.setBounds(188, 210, 226, 23);
		contentPane.add(textFieldname);
		textFieldname.setColumns(10);

		JLabel checklbl = new JLabel("");
		checklbl.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		checklbl.setHorizontalAlignment(SwingConstants.CENTER);
		checklbl.setBounds(243, 390, 142, 13);
		contentPane.add(checklbl);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textFieldname.getText();
				boolean check = Contact_Dictionary.checkcontact(name);
				if (check == false) {
					checklbl.setText("Contact Does Not Exist");
				} else {
					Contact_Dictionary.deleteData(name);
					checklbl.setText("Contact Deleted");
					Contact_Dictionary.exportData();
				}
			}
		});
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 10));
		btnNewButton.setBounds(528, 382, 85, 21);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFunctions.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 12));
		btnNewButton_1.setBounds(10, 382, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}