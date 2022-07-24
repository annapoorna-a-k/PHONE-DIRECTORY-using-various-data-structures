package Phone_Directory;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Search_Contact extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_Contact frame = new Search_Contact();
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
	public Search_Contact() {
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
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(106, 137, 416, 31);
		contentPane.add(lblNewLabel);

		JButton btnsearchName = new JButton("NAME");
		btnsearchName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_Name.main(null);
			}
		});
		btnsearchName.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		btnsearchName.setBounds(145, 198, 124, 31);
		contentPane.add(btnsearchName);

		JButton btnByPhoneNo = new JButton("PHONE NO.");
		btnByPhoneNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_Phone.main(null);
			}
		});
		btnByPhoneNo.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		btnByPhoneNo.setBounds(337, 198, 124, 31);
		contentPane.add(btnByPhoneNo);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFunctions.main(null);
			}
		});
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		btnNewButton.setBounds(10, 382, 85, 21);
		contentPane.add(btnNewButton);
	}
}
