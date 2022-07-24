package Phone_Directory;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Update_Contactini extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_Contactini frame = new Update_Contactini();
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
	public Update_Contactini() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("UPDATE CONTACT");
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(160, 133, 280, 39);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Enter Name of the Contact to be Updated: ");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		lblNewLabel_1.setBounds(160, 196, 322, 13);
		contentPane.add(lblNewLabel_1);

		textFieldname = new JTextField();
		textFieldname.setBounds(185, 220, 226, 19);
		contentPane.add(textFieldname);
		textFieldname.setColumns(10);

		JLabel checklbl = new JLabel("");
		checklbl.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		checklbl.setHorizontalAlignment(SwingConstants.CENTER);
		checklbl.setBounds(252, 390, 142, 13);
		contentPane.add(checklbl);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textFieldname.getText();
				boolean check = Contact_Dictionary.checkcontact(name);
				if (check == false) {
					checklbl.setText("Contact Does Not Exist");
				} else {
					Update_Contact.main(name);
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
		btnNewButton_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 10));
		btnNewButton_1.setBounds(10, 382, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
