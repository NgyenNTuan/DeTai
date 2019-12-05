package giaodien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class GiaoDienTraBangDia extends JFrame {

	private JPanel contentPane;
	private JTable tableBDThue,tableBDTra;
	private DefaultTableModel tablemodelThue,tablemodelTra;
	private JPanel panel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDienTraBangDia frame = new GiaoDienTraBangDia();
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
	public GiaoDienTraBangDia() {
		setTitle("Thuê Băng Đĩa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1120, 643);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] colNameCT = "Mã Băng Đĩa;Tên Băng Đĩa;Số Lượng".split(";");
		tablemodelThue = new DefaultTableModel(colNameCT, 0);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "B\u0103ng \u0110\u0129a \u0110ang Thu\u00EA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 152, 471, 331);
		contentPane.add(panel);
		panel.setLayout(null);
		JScrollPane scrollPane = new JScrollPane(tableBDThue = new JTable(tablemodelThue),
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 21, 451, 299);
		panel.add(scrollPane);
		
		tablemodelTra = new DefaultTableModel(colNameCT, 0);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Tr\u1EA3 B\u0103ng \u0110\u0129a", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(630, 152, 471, 331);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		JScrollPane scrollPane1 = new JScrollPane(tableBDTra = new JTable(tablemodelTra),
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane1.setBounds(10, 23, 451, 297);
		panel_1.add(scrollPane1);
		
	}
}
