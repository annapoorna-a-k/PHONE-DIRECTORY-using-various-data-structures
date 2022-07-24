package Phone_Directory;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class AdminMenu extends JFrame {

	private JPanel contentPane;
	private JTextField usernametf;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu frame = new AdminMenu();
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
	public AdminMenu() {
		setTitle("Admin_Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ADMIN LOGIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 25));
		lblNewLabel.setBounds(194, 86, 207, 54);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(145, 136, 88, 34);
		contentPane.add(lblNewLabel_1);

		usernametf = new JTextField();
		usernametf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		usernametf.setDropMode(DropMode.INSERT);
		usernametf.setBounds(146, 166, 310, 34);
		contentPane.add(usernametf);
		usernametf.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 14));
		lblNewLabel_2.setBounds(145, 216, 88, 34);
		contentPane.add(lblNewLabel_2);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.main(null);
				;
			}
		});
		btnBack.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 12));
		btnBack.setBounds(10, 382, 85, 21);
		contentPane.add(btnBack);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(103, 209, 180, 13);
		contentPane.add(lblNewLabel_3);

		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ui = usernametf.getText();
				String pi = passwordField.getText();
				if (ui.equals("admin101") && pi.equals("phoneadmin")) {
					AdminFunctions.main(null);
				} else {
					lblNewLabel_3.setText("Invalid Login Credentials");
				}
			}
		});

		btnLogin.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 12));
		btnLogin.setBounds(528, 382, 85, 21);
		contentPane.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(145, 244, 311, 34);
		contentPane.add(passwordField);
		
		JCheckBox CheckBox = new JCheckBox("SHOW PASSWORD");
		CheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('●');
				}
			}
		});
		CheckBox.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		CheckBox.setBounds(145, 284, 170, 27);
		contentPane.add(CheckBox);

	}
}
