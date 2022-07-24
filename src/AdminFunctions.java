package Phone_Directory;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AdminFunctions extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFunctions frame = new AdminFunctions();
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
	public AdminFunctions() {
		setTitle("Admin_Function");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("WELCOME ADMIN!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 25));
		lblNewLabel.setBounds(179, 67, 255, 32);
		contentPane.add(lblNewLabel);

		JButton btnInsertContact = new JButton("Add Contact");
		btnInsertContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Insert_Contact.main(null);
			}
		});
		btnInsertContact.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		btnInsertContact.setBounds(227, 110, 156, 21);
		contentPane.add(btnInsertContact);

		JButton btnUpdatecontact = new JButton("Update Contact");
		btnUpdatecontact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_Contactini.main(null);
			}
		});
		btnUpdatecontact.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		btnUpdatecontact.setBounds(227, 154, 156, 21);
		contentPane.add(btnUpdatecontact);

		JButton btnDeleteContact = new JButton("Delete Contact");
		btnDeleteContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete_Contact.main(null);
			}
		});
		btnDeleteContact.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		btnDeleteContact.setBounds(227, 201, 155, 21);
		contentPane.add(btnDeleteContact);

		JButton btnViewDirectory = new JButton("View Directory");
		btnViewDirectory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_Directory.main(null);
			}
		});
		btnViewDirectory.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		btnViewDirectory.setBounds(227, 246, 155, 21);
		contentPane.add(btnViewDirectory);

		JButton btnSearchForA = new JButton("Search Contact");
		btnSearchForA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_Contact.main(null);
			}
		});
		btnSearchForA.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		btnSearchForA.setBounds(227, 290, 155, 21);
		contentPane.add(btnSearchForA);

		JButton btnFilterSearch = new JButton("Filter Search");
		btnFilterSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Filter_Search.main(null);
			}
		});
		btnFilterSearch.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		btnFilterSearch.setBounds(228, 333, 155, 21);
		contentPane.add(btnFilterSearch);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenu.main(null);
			}
		});
		btnBack.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		btnBack.setBounds(10, 382, 78, 21);
		contentPane.add(btnBack);
	}
}
