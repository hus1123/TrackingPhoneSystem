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

public class TrackPhone {


	private JFrame frmTrackMobilePhone;
	private JTextField txtSerialno;
	private JTextField txtImeino;

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrackPhone window = new TrackPhone();
					window.frmTrackMobilePhone.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	/**
	 * Create the application.
	 */
	public TrackPhone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrackMobilePhone = new JFrame();
		frmTrackMobilePhone.setTitle("Track Mobile Phone");
		frmTrackMobilePhone.setBounds(100, 100, 500, 550);
		frmTrackMobilePhone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmTrackMobilePhone.getContentPane().setLayout(null);
		
		JButton button = new JButton("Main Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu MM = new MainMenu();
				String[] args = null;
				MainMenu.main(args);
				frmTrackMobilePhone.dispose();
				}
		});
		button.setBounds(195, 394, 117, 29);
		frmTrackMobilePhone.getContentPane().add(button);
		
		JLabel lblEnterAnyoneOf = new JLabel("Enter anyone of the following to Track Mobile Phone");
		lblEnterAnyoneOf.setBounds(81, 33, 354, 16);
		frmTrackMobilePhone.getContentPane().add(lblEnterAnyoneOf);
		
		txtSerialno = new JTextField();
		txtSerialno.setColumns(10);
		txtSerialno.setBounds(175, 61, 202, 26);
		frmTrackMobilePhone.getContentPane().add(txtSerialno);
		
		txtImeino = new JTextField();
		txtImeino.setColumns(10);
		txtImeino.setBounds(175, 101, 202, 26);
		frmTrackMobilePhone.getContentPane().add(txtImeino);
		
		JLabel label_1 = new JLabel("IMEI No:");
		label_1.setBounds(110, 106, 61, 16);
		frmTrackMobilePhone.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Serial No:");
		label_2.setBounds(110, 66, 61, 16);
		frmTrackMobilePhone.getContentPane().add(label_2);
		
		JButton button_1 = new JButton("Enter");
		button_1.addActionListener(new ActionListener() {
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
		button_1.setBounds(175, 139, 117, 29);
		frmTrackMobilePhone.getContentPane().add(button_1);
		
		JTextArea txtrTrackingMap = new JTextArea();
		txtrTrackingMap.setText("Tracking Map");
		txtrTrackingMap.setBounds(56, 196, 391, 186);
		frmTrackMobilePhone.getContentPane().add(txtrTrackingMap);
	}

}
