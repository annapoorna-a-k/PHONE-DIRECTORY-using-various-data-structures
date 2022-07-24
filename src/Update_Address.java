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

public class Update_Address extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String name) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_Address frame = new Update_Address(name);
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
	public Update_Address(String name) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ENTER NEW ADDRESS:");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(199, 169, 202, 20);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("UPDATE ADDRESS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 27));
		lblNewLabel_1.setBounds(189, 124, 234, 34);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(221, 194, 159, 19);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblupdated = new JLabel("");
		lblupdated.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 13));
		lblupdated.setBounds(244, 390, 136, 13);
		contentPane.add(lblupdated);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String address = textField.getText();
				Contact_Dictionary.updateaddress(name, address);
				lblupdated.setText("Contact Updated");
			}
		});
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 11));
		btnNewButton.setBounds(516, 382, 97, 21);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_Contact.main(name);
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 11));
		btnNewButton_1.setBounds(10, 382, 85, 21);
		contentPane.add(btnNewButton_1);

	}
}