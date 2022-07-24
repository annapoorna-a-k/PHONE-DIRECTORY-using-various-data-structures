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

public class Search_NameUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_NameUser frame = new Search_NameUser();
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
	public Search_NameUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Enter the Name to be Searched: ");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(21, 49, 331, 44);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(338, 62, 230, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel NAMEQ = new JLabel("");
		NAMEQ.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		NAMEQ.setHorizontalAlignment(SwingConstants.CENTER);
		NAMEQ.setBounds(223, 124, 56, 44);
		contentPane.add(NAMEQ);

		JLabel NAMEA = new JLabel("");
		NAMEA.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		NAMEA.setBounds(322, 124, 198, 44);
		contentPane.add(NAMEA);

		JLabel PHONEQ = new JLabel("");
		PHONEQ.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		PHONEQ.setHorizontalAlignment(SwingConstants.CENTER);
		PHONEQ.setBounds(201, 179, 78, 29);
		contentPane.add(PHONEQ);

		JLabel PHONEA = new JLabel("");
		PHONEA.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		PHONEA.setBounds(322, 179, 149, 29);
		contentPane.add(PHONEA);

		JLabel ADDQ = new JLabel("");
		ADDQ.setHorizontalAlignment(SwingConstants.CENTER);
		ADDQ.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		ADDQ.setBounds(214, 232, 65, 29);
		contentPane.add(ADDQ);

		JLabel ADDA = new JLabel("");
		ADDA.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		ADDA.setBounds(322, 232, 149, 29);
		contentPane.add(ADDA);

		JLabel EMAILQ = new JLabel("");
		EMAILQ.setHorizontalAlignment(SwingConstants.CENTER);
		EMAILQ.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		EMAILQ.setBounds(214, 282, 65, 29);
		contentPane.add(EMAILQ);

		JLabel EMAILA = new JLabel("");
		EMAILA.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		EMAILA.setBounds(322, 282, 149, 29);
		contentPane.add(EMAILA);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AVLTree.findByName(textField.getText());
				String details = AVLTree.ans;
				String[] ans = details.split("-");
				NAMEQ.setText("Name: ");
				NAMEA.setText(ans[0]);
				PHONEQ.setText("Phone No.: ");
				PHONEA.setText(ans[1]);
				ADDQ.setText("Address: ");
				ADDA.setText(ans[2]);
				EMAILQ.setText("Email Id: ");
				EMAILA.setText(ans[3]);
			}
		});
		btnNewButton.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		btnNewButton.setBounds(528, 382, 85, 21);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_ContactUser.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		btnNewButton_1.setBounds(10, 382, 85, 21);
		contentPane.add(btnNewButton_1);
	}

}
