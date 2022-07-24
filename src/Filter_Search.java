package Phone_Directory;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Filter_Search extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Filter_Search frame = new Filter_Search();
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
	public Filter_Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ENTER PREFIX OF THE NAME TO BE SEARCHED: ");
		lblNewLabel.setBounds(10, 11, 395, 45);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(384, 20, 229, 30);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel falselbl = new JLabel("");
		falselbl.setBounds(232, 180, 163, 65);
		falselbl.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		falselbl.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(falselbl);

		JTable table = new JTable();
		table.setForeground(Color.WHITE);
		table.setBackground(Color.white);
		table.setBackground(Color.black);
		table.setGridColor(Color.WHITE);
		table.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);

		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(10, 67, 609, 305);
		pane.setForeground(Color.BLACK);
		pane.setBackground(Color.WHITE);
		contentPane.add(pane);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(534, 383, 85, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prefix = textField.getText();
				String lines = Contact_Dictionary.filtername(prefix);
				if (lines != null) {
					String[] ans = lines.split("\n");
					Object[] columns = { "NAME", "PHONE NO", "ADDRESS", "EMAIL ID" };
					DefaultTableModel model = new DefaultTableModel();
					model.setColumnIdentifiers(columns);
					table.setModel(model);
					String[] row = new String[4];
					for (int i = 0; i < ans.length; i++) {
						row[0] = ans[i].split("-")[0];
						row[1] = ans[i].split("-")[1];
						row[2] = ans[i].split("-")[2];
						row[3] = ans[i].split("-")[3];
						model.addRow(row);
					}
				} else {
					falselbl.setText("NO SUCH CONTACT");
				}
			}
		});
		btnNewButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 14));
		contentPane.add(btnNewButton);

		JButton btnNewButton1 = new JButton("BACK");
		btnNewButton1.setBounds(10, 383, 85, 21);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFunctions.main(null);
			}
		});
		btnNewButton1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 13));
		contentPane.add(btnNewButton1);

	}

}
