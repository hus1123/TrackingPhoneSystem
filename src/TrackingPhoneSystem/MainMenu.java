package TrackingPhoneSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 550);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton btnRegisterMobilePhone = new JButton("Register Mobile Phone");
		btnRegisterMobilePhone.setBounds(150, 80, 200, 50);
		btnRegisterMobilePhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterPhone RP = new RegisterPhone();
				String[] args = null;
				RegisterPhone.main(args);
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnRegisterMobilePhone);
		
		JButton btnTrackMobilePhone = new JButton("Track Mobile Phone");
		btnTrackMobilePhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			TrackPhone TP = new TrackPhone();
			String[] args = null;
			TrackPhone.main(args);
			frame.dispose();
			}
		});
		btnTrackMobilePhone.setBounds(150, 130, 200, 50);
		frame.getContentPane().add(btnTrackMobilePhone);
		
		JButton btnBlockMobilePhone = new JButton("Block Mobile Phone");
		btnBlockMobilePhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			BlockPhone BP = new BlockPhone();
			String[] args = null;
			BlockPhone.main(args);	
			frame.dispose();
			}
		});
		btnBlockMobilePhone.setBounds(150, 180, 200, 50);
		frame.getContentPane().add(btnBlockMobilePhone);
		
		JButton btnSendWarning = new JButton("Send Warning");
		btnSendWarning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SendWarning SW = new SendWarning();
				String[] args = null;
				SendWarning.main(args);
				frame.dispose();
			}
		});
		btnSendWarning.setBounds(150, 230, 200, 50);
		frame.getContentPane().add(btnSendWarning);
		
		JButton btnHistory = new JButton("History");
		btnHistory.addActionListener(new ActionListener() {	
		public void actionPerformed(ActionEvent evt) {
		
			History His = new History();
			String[] args = null;
			History.main(args);
			frame.dispose();
			}
		});
		btnHistory.setBounds(150, 280, 200, 50);
		frame.getContentPane().add(btnHistory);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Sign_in SI = new Sign_in();
			String[] args = null;
			Sign_in.main(args);
			frame.dispose();
			}
		});
		btnLogOut.setBounds(390, 480, 100, 29);
		frame.getContentPane().add(btnLogOut);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setBounds(444, 6, 50, 29);
		frame.getContentPane().add(btnExit);
	}

}
