package TrackingPhoneSystem;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import javax.swing.JCheckBox;

public class SendWarning {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SendWarning window = new SendWarning();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SendWarning() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 550);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton button = new JButton("Main Menu");
		button.setBounds(284, 443, 117, 29);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu MM = new MainMenu();
				String[] args = null;
				MainMenu.main(args);
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel("Enter anyone of the following to generate History");
		label.setBounds(82, 17, 319, 16);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(172, 45, 202, 26);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 85, 202, 26);
		frame.getContentPane().add(textField_1);
		
		JLabel label_1 = new JLabel("IMEI No:");
		label_1.setBounds(107, 90, 61, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Serial No:");
		label_2.setBounds(107, 50, 61, 16);
		frame.getContentPane().add(label_2);
		
		JButton button_1 = new JButton("Enter");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String SerialNO = textField.getText();
				String Imeino = textField_1.getText();
				
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
		button_1.setBounds(172, 123, 117, 29);
		frame.getContentPane().add(button_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("History Table");
		textArea.setBounds(53, 180, 391, 91);
		frame.getContentPane().add(textArea);
		
		JRadioButton rdbtnWarning = new JRadioButton("Warning");
		rdbtnWarning.setSelected(true);
		rdbtnWarning.setBounds(100, 302, 141, 23);
		frame.getContentPane().add(rdbtnWarning);
		
		JRadioButton rdbtnMessage = new JRadioButton("Message");
		rdbtnMessage.setBounds(276, 302, 117, 23);
		frame.getContentPane().add(rdbtnMessage);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(45, 337, 398, 91);
		frame.getContentPane().add(editorPane);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
					JOptionPane.showMessageDialog(frame, "Warning/message is send successfully");
				
			}
		});
		btnSend.setBounds(101, 443, 117, 29);
		frame.getContentPane().add(btnSend);
	}
}
