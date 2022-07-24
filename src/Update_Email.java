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

public class Update_Email extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String name) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_Email frame = new Update_Email(name);
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
	public Update_Email(String name) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Enter New Email Id:");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(192, 197, 202, 20);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("UPDATE EMAIL ID:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 27));
		lblNewLabel_1.setBounds(182, 152, 234, 34);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(204, 229, 192, 19);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblupdated = new JLabel("");
		lblupdated.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 13));
		lblupdated.setBounds(239, 390, 136, 13);
		contentPane.add(lblupdated);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String address = textField.getText();
				Contact_Dictionary.updatemail(name, address);
				lblupdated.setText("Contact Updated");
			}
		});
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 10));
		btnNewButton.setBounds(516, 382, 97, 21);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_Contact.main(name);
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 10));
		btnNewButton_1.setBounds(10, 382, 85, 21);
		contentPane.add(btnNewButton_1);
	}

}
