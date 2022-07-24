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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class Search_Name extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_Name frame = new Search_Name();
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
	public Search_Name() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Enter the Name to be Searched: ");
		lblNewLabel.setBounds(10, 31, 340, 43);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(337, 46, 265, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel NAMEQ = new JLabel("");
		NAMEQ.setBounds(212, 119, 63, 29);
		NAMEQ.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		NAMEQ.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(NAMEQ);

		JLabel NAMEA = new JLabel("");
		NAMEA.setBounds(301, 119, 198, 29);
		NAMEA.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		contentPane.add(NAMEA);

		JLabel PHONEQ = new JLabel("");
		PHONEQ.setBounds(186, 159, 85, 29);
		PHONEQ.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		PHONEQ.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(PHONEQ);

		JLabel PHONEA = new JLabel("");
		PHONEA.setBounds(301, 159, 198, 29);
		PHONEA.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		contentPane.add(PHONEA);

		JLabel ADDQ = new JLabel("");
		ADDQ.setBounds(196, 208, 85, 29);
		ADDQ.setHorizontalAlignment(SwingConstants.CENTER);
		ADDQ.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		contentPane.add(ADDQ);

		JLabel ADDA = new JLabel("");
		ADDA.setBounds(301, 208, 198, 29);
		ADDA.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		contentPane.add(ADDA);

		JLabel EMAILQ = new JLabel("");
		EMAILQ.setBounds(196, 255, 85, 33);
		EMAILQ.setHorizontalAlignment(SwingConstants.CENTER);
		EMAILQ.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		contentPane.add(EMAILQ);

		JLabel EMAILA = new JLabel("");
		EMAILA.setBounds(301, 255, 198, 33);
		EMAILA.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		contentPane.add(EMAILA);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(528, 382, 85, 21);
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
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setBounds(10, 382, 85, 21);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_Contact.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		contentPane.add(btnNewButton_1);

	}
}
