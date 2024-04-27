package TrackingPhoneSystem;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BlockPhone {

	private JFrame frmBlockMobilePhone;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlockPhone window = new BlockPhone();
					window.frmBlockMobilePhone.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BlockPhone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBlockMobilePhone = new JFrame();
		frmBlockMobilePhone.setTitle("Block Mobile Phone");
		frmBlockMobilePhone.setBounds(100, 100, 500, 550);
		frmBlockMobilePhone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmBlockMobilePhone.getContentPane().setLayout(null);
		
		JButton button = new JButton("Main Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu MM = new MainMenu();
				String[] args = null;
				MainMenu.main(args);
				frmBlockMobilePhone.dispose();}
			
		});
		button.setBounds(319, 418, 117, 29);
		frmBlockMobilePhone.getContentPane().add(button);
		
		JEditorPane dtrpnShowBlockOr = new JEditorPane();
		dtrpnShowBlockOr.setText("                                                  block or Active Phones\nSerial No|| IMEI NO                         || Name    || Phone Number      ||  Status   \n0001         123456789653432        Ahmad     0555 111 00 00        Block \n0002         123456456634543        Ali            0555 222 00 11        Active \n0003         123456789123456        Mohd       0555 333 23 99        Active \n0004         123450000023333       Hamad     0555 234 34 65        Block ");
		dtrpnShowBlockOr.setBounds(6, 54, 488, 223);
		frmBlockMobilePhone.getContentPane().add(dtrpnShowBlockOr);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(167, 362, 202, 26);
		frmBlockMobilePhone.getContentPane().add(textField);
		
		JLabel label = new JLabel("Serial No:");
		label.setBounds(102, 367, 61, 16);
		frmBlockMobilePhone.getContentPane().add(label);
		
		JLabel lblEnterSerialNo = new JLabel("Enter Serial No to Block or Active Mobile Phone");
		lblEnterSerialNo.setBounds(94, 334, 307, 16);
		frmBlockMobilePhone.getContentPane().add(lblEnterSerialNo);
		
		JButton btnBlock = new JButton("Block");
		btnBlock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SerialNO = textField.getText();
				
				if(SerialNO.equals(Information.getSerialNo()))
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Serial no is Block now");
				}
			}
		});
		btnBlock.setBounds(46, 418, 117, 29);
		frmBlockMobilePhone.getContentPane().add(btnBlock);
		
		JButton btnActive = new JButton("Active");
		btnActive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	String SerialNO = textField.getText();
				
			if(SerialNO.equals(Information.getSerialNo()))
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Serial no is Active now");
				}
			}
			
		});
		btnActive.setBounds(175, 418, 117, 29);
		frmBlockMobilePhone.getContentPane().add(btnActive);
	}

}
