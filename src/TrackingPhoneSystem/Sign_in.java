package TrackingPhoneSystem;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Sign_in {


	private JFrame frmSignIn;
	private JTextField Username;
	private JPasswordField Password;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	private JPasswordField passwordField;
	private JButton btnSignUp;
	private JTextField txtEmail;
	private JLabel lblName;
	private JLabel lblEmail;
	private JLabel lblUsername_1;
	private JLabel lblPassword_1;
	private JLabel lblPassword_2;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign_in window = new Sign_in();
					window.frmSignIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sign_in() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignIn = new JFrame();
		frmSignIn.setTitle("Sign In");
		frmSignIn.setBounds(100, 100, 500, 550);
		frmSignIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignIn.getContentPane().setLayout(null);
		
		Username = new JTextField();
		Username.setBounds(137, 64, 250, 32);
		frmSignIn.getContentPane().add(Username);
		Username.setColumns(10);
		
		Password = new JPasswordField();
		Password.setToolTipText("");
		Password.setBounds(137, 104, 250, 32);
		frmSignIn.getContentPane().add(Password);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(61, 72, 72, 16);
		frmSignIn.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(61, 112, 72, 16);
		frmSignIn.getContentPane().add(lblPassword);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usern = Username.getText();
				@SuppressWarnings("deprecation")
				String Pass = Password.getText();
				
				if(usern.equals(UserDetail.getUsername()) && Pass.equals(UserDetail.getPassword()))
				{
					MainMenu mu = new MainMenu();
					String[] args = null;
					MainMenu.main(args);
					frmSignIn.dispose();
				} else
				{
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
				}
				
			}
		});
		btnSignIn.setBounds(190, 142, 140, 29);
		frmSignIn.getContentPane().add(btnSignIn);
		
		JButton btnForgotPassword = new JButton("Forgot password");
		btnForgotPassword.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "Please Sign Up Agian");
				
			}
			
				
		});
		btnForgotPassword.setBounds(190, 172, 140, 29);
		frmSignIn.getContentPane().add(btnForgotPassword);
		
		txtName = new JTextField();
		txtName.setToolTipText("");
		txtName.setBounds(137, 240, 250, 32);
		frmSignIn.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(137, 280, 250, 32);
		frmSignIn.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(137, 320, 250, 32);
		frmSignIn.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(137, 360, 250, 32);
		frmSignIn.getContentPane().add(pwdPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 400, 250, 32);
		frmSignIn.getContentPane().add(passwordField);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 
				        if(e.getSource()==btnSignUp)
				        { 
				        	
				        	UserDetail.setName(txtName.getText());
							UserDetail.setEmail(txtEmail.getText());
							UserDetail.setUsername(txtUsername.getText());
							UserDetail.setPassword(pwdPassword.getText());
							UserDetail.setconfirmpassword(passwordField.getText());
							if(pwdPassword.getText().equalsIgnoreCase(passwordField.getText()))
							{

								UserDetail.executeUpdate();
							    JOptionPane.showMessageDialog(null,"User Registered Successfully");
							}
							else
							{
							    JOptionPane.showMessageDialog(null,"password did not match");
							}
						
				        }
			}
		});
		btnSignUp.setBounds(190, 440, 117, 29);
		frmSignIn.getContentPane().add(btnSignUp);
		
		lblName = new JLabel("Name:");
		lblName.setBounds(61, 248, 61, 16);
		frmSignIn.getContentPane().add(lblName);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setBounds(61, 288, 61, 16);
		frmSignIn.getContentPane().add(lblEmail);
		
		lblUsername_1 = new JLabel("Username:");
		lblUsername_1.setBounds(61, 328, 72, 16);
		frmSignIn.getContentPane().add(lblUsername_1);
		
		lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setBounds(61, 368, 72, 16);
		frmSignIn.getContentPane().add(lblPassword_1);
		
		lblPassword_2 = new JLabel("Password:");
		lblPassword_2.setBounds(61, 408, 72, 16);
		frmSignIn.getContentPane().add(lblPassword_2);
	}
}
