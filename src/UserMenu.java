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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class UserMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMenu frame = new UserMenu();
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
	public UserMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.main(null);
			}
		});
		btnBack.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 12));
		btnBack.setBounds(10, 382, 85, 21);
		contentPane.add(btnBack);

		JLabel lblNewLabel = new JLabel("WELCOME USER!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 27));
		lblNewLabel.setBounds(170, 108, 260, 64);
		contentPane.add(lblNewLabel);

		JButton btnViewDirectory = new JButton("VIEW DIRECTORY");
		btnViewDirectory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_DirectoryUser.main(null);
			}
		});
		btnViewDirectory.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 14));
		btnViewDirectory.setBounds(211, 183, 179, 21);
		contentPane.add(btnViewDirectory);

		JButton btnSearchForA = new JButton("SEARCH CONTACT");
		btnSearchForA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_ContactUser.main(null);
			}
		});
		btnSearchForA.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		btnSearchForA.setBounds(211, 227, 179, 21);
		contentPane.add(btnSearchForA);

		JButton btnFilterSearch = new JButton("FILTER SEARCH");
		btnFilterSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Filter_SearchUser.main(null);
			}
		});
		btnFilterSearch.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		btnFilterSearch.setBounds(211, 269, 179, 21);
		contentPane.add(btnFilterSearch);

	}

}
