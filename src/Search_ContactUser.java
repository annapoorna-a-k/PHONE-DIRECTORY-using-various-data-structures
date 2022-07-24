package Phone_Directory;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Search_ContactUser extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_ContactUser frame = new Search_ContactUser();
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
	public Search_ContactUser() {
		AVLTree obj = new AVLTree();
		for (Map.Entry<String, Contact> a : Contact_Dictionary.contact.entrySet()) {
			obj.insert(a.getKey(), a.getValue());
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("SEARCH BY: ");
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(109, 135, 416, 31);
		contentPane.add(lblNewLabel);

		JButton btnsearchName = new JButton("NAME");
		btnsearchName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_NameUser.main(null);
			}
		});
		btnsearchName.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		btnsearchName.setBounds(167, 191, 114, 31);
		contentPane.add(btnsearchName);

		JButton btnByPhoneNo = new JButton("PHONE NO.");
		btnByPhoneNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_PhoneUser.main(null);
			}
		});
		btnByPhoneNo.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		btnByPhoneNo.setBounds(343, 191, 114, 31);
		contentPane.add(btnByPhoneNo);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMenu.main(null);
			}
		});
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		btnNewButton.setBounds(10, 382, 85, 21);
		contentPane.add(btnNewButton);
	}

}
