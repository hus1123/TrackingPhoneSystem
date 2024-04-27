package TrackingPhoneSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

public class RegisterPhone {

	private JFrame frmRegisterMobilePhone;
	private JTextField txtSerailNo;
	private JTextField txtImeiNo;
	private JTextField txtName;
	private JTextField txtPhoneNo;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPhone window = new RegisterPhone();
					window.frmRegisterMobilePhone.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegisterPhone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegisterMobilePhone = new JFrame();
		frmRegisterMobilePhone.setTitle("Register Mobile Phone");
		frmRegisterMobilePhone.setBounds(100, 100, 500, 550);
		frmRegisterMobilePhone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmRegisterMobilePhone.getContentPane().setLayout(null);
		
		JButton button = new JButton("Main Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu MM = new MainMenu();
				String[] args = null;
				MainMenu.main(args);
				frmRegisterMobilePhone.dispose();}
		});
		button.setBounds(330, 350, 100, 30);
		frmRegisterMobilePhone.getContentPane().add(button);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(132, 110, 61, 16);
		frmRegisterMobilePhone.getContentPane().add(lblName);
		
		JLabel lblNewLabel = new JLabel("Serial No:");
		lblNewLabel.setBounds(132, 50, 61, 16);
		frmRegisterMobilePhone.getContentPane().add(lblNewLabel);
		
		JLabel lblImeiNo = new JLabel("IMEI No:");
		lblImeiNo.setBounds(132, 80, 61, 16);
		frmRegisterMobilePhone.getContentPane().add(lblImeiNo);
		
		JLabel lblPhoneNo = new JLabel("Phone No:");
		lblPhoneNo.setBounds(132, 140, 61, 16);
		frmRegisterMobilePhone.getContentPane().add(lblPhoneNo);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(132, 230, 61, 16);
		frmRegisterMobilePhone.getContentPane().add(lblAddress);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setBounds(132, 170, 61, 16);
		frmRegisterMobilePhone.getContentPane().add(lblNewLabel_1);
		
		txtSerailNo = new JTextField();
		txtSerailNo.setBounds(216, 40, 130, 26);
		frmRegisterMobilePhone.getContentPane().add(txtSerailNo);
		txtSerailNo.setColumns(10);
		
		txtImeiNo = new JTextField();
		txtImeiNo.setBounds(216, 70, 130, 26);
		frmRegisterMobilePhone.getContentPane().add(txtImeiNo);
		txtImeiNo.setColumns(10);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setBounds(216, 100, 130, 26);
		frmRegisterMobilePhone.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtPhoneNo = new JTextField();
		txtPhoneNo.setText("Phone No");
		txtPhoneNo.setBounds(216, 130, 130, 26);
		frmRegisterMobilePhone.getContentPane().add(txtPhoneNo);
		txtPhoneNo.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(216, 165, 130, 26);
		frmRegisterMobilePhone.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(150, 200, 71, 23);
		frmRegisterMobilePhone.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(230, 200, 80, 23);
		frmRegisterMobilePhone.getContentPane().add(rdbtnFemale);
		
		JTextPane txtpnAddress = new JTextPane();
		txtpnAddress.setBounds(227, 230, 223, 94);
		frmRegisterMobilePhone.getContentPane().add(txtpnAddress);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(e.getSource()==btnRegister)
			        { 
			        	
					 Information.setSerialNo(txtSerailNo.getText());
					 Information.setImeiNo(txtImeiNo.getText());
					 Information.setName(txtName.getText());
					 Information.setPhoneNo(txtPhoneNo.getText());
					 Information.setEmail(txtEmail.getText());
					 Information.setGender(rdbtnMale.getText());
					 Information.setAddress(txtpnAddress.getText());
					 


							
						    JOptionPane.showMessageDialog(null,"User Registered Successfully");
		
					
			        }      
			}
		});
		btnRegister.setBounds(30, 350, 100, 30);
		frmRegisterMobilePhone.getContentPane().add(btnRegister);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(130, 350, 100, 30);
		frmRegisterMobilePhone.getContentPane().add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(230, 350, 100, 30);
		frmRegisterMobilePhone.getContentPane().add(btnDelete);
	}
}
