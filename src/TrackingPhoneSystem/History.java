package TrackingPhoneSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class History {

	private JFrame History;
	private JTextField txtSerialno;
	private JTextField txtImeino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					History window = new History();
					window.History.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public History() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		History = new JFrame();
		History.setTitle("History");
		History.setBounds(100, 100, 500, 550);
		History.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		History.getContentPane().setLayout(null);
		
		JLabel lblSerialNo = new JLabel("Serial No:");
		lblSerialNo.setBounds(113, 51, 61, 16);
		History.getContentPane().add(lblSerialNo);
		
		JLabel lblImeiNo = new JLabel("IMEI No:");
		lblImeiNo.setBounds(113, 91, 61, 16);
		History.getContentPane().add(lblImeiNo);
		
		txtSerialno = new JTextField();
		txtSerialno.setBounds(178, 46, 202, 26);
		History.getContentPane().add(txtSerialno);
		txtSerialno.setColumns(10);
		
		txtImeino = new JTextField();
		txtImeino.setBounds(178, 86, 202, 26);
		History.getContentPane().add(txtImeino);
		txtImeino.setColumns(10);
		
		JLabel lblEnterAnyoneOf = new JLabel("Enter anyone of the following to generate History");
		lblEnterAnyoneOf.setBounds(88, 18, 319, 16);
		History.getContentPane().add(lblEnterAnyoneOf);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SerialNO = txtSerialno.getText();
				String Imeino = txtImeino.getText();
				
				if(SerialNO.equals(Information.getSerialNo()) || Imeino.equals(Information.getImeiNo()))
					
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "valid Serial No / IMEI");
				} else
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Invalid Serial No / IMEI");
				}
			}
		});
		btnEnter.setBounds(178, 124, 117, 29);
		History.getContentPane().add(btnEnter);
		
		JTextArea txtrHistoryTable = new JTextArea();
		txtrHistoryTable.setText("History Table");
		txtrHistoryTable.setBounds(59, 181, 391, 186);
		History.getContentPane().add(txtrHistoryTable);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu MM = new MainMenu();
				String[] args = null;
				MainMenu.main(args);
				History.dispose();
				
			}
		});
		btnMainMenu.setBounds(198, 379, 117, 29);
		History.getContentPane().add(btnMainMenu);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
