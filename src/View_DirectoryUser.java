package Phone_Directory;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class View_DirectoryUser extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_DirectoryUser frame = new View_DirectoryUser();
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
	public View_DirectoryUser() {
		JTable table = new JTable();
		table.setForeground(Color.WHITE);
		Object[] columns = { "NAME", "PHONE NO", "ADDRESS", "EMAIL ID" };
		DefaultTableModel model = new DefaultTableModel();

		JFrame frame = new JFrame("DIRECTORY");
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 637, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		model.setColumnIdentifiers(columns);
		frame.getContentPane().setLayout(null);
		table.setModel(model);

		table.setBackground(Color.white);
		table.setBackground(Color.black);
		table.setSelectionBackground(Color.red);
		table.setGridColor(Color.WHITE);
		table.setSelectionForeground(Color.white);
		table.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);

		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(10, 10, 609, 336);
		pane.setForeground(Color.BLACK);
		pane.setBackground(Color.WHITE);
		frame.getContentPane().add(pane);

		TreeMap<String, Contact> data = Contact_Dictionary.contact;
		String[] row = new String[4];
		for (Map.Entry<String, Contact> a : data.entrySet()) {
			row[0] = a.getKey();
			row[1] = a.getValue().getMobile();
			row[2] = a.getValue().getAddress();
			row[3] = a.getValue().getEmail();
			model.addRow(row);
		}

		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMenu.main(null);
			}
		});
		btnback.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 15));
		btnback.setBounds(259, 356, 95, 21);
		frame.getContentPane().add(btnback);
		frame.setVisible(true);
	}

}
