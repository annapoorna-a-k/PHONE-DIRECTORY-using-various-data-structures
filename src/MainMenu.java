package Phone_Directory;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private final JButton btnAdmin = new JButton("ADMIN");
	private final JButton btnUser = new JButton("USER");
	private final JLabel label = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setTitle("Main_Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("PHONE DIRECTORY");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 27));
		lblNewLabel.setBounds(169, 40, 292, 62);
		contentPane.add(lblNewLabel);
		btnAdmin.setBackground(Color.WHITE);
		btnAdmin.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 17));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenu.main(null);
				;
			}
		});
		btnAdmin.setBounds(376, 134, 153, 41);
		contentPane.add(btnAdmin);
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMenu.main(null);
			}
		});

		btnUser.setBackground(Color.WHITE);
		btnUser.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 17));
		btnUser.setBounds(376, 221, 153, 41);
		contentPane.add(btnUser);

		Image img = new ImageIcon(this.getClass().getResource("/phone.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(46, 80, 320, 293);
		contentPane.add(label);
	}
}
