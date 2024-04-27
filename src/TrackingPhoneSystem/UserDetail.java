package TrackingPhoneSystem;

public class UserDetail { 
	
	private static String name;
	private static String email;
	private static String password;
	private static String username;
	private static String confirmpassword;

	public UserDetail(String name, String email, String password, String username, String confirmpassword) {
		super();
		UserDetail.name = name;
		UserDetail.email = email;
		UserDetail.password = password;
		UserDetail.username = username;
		UserDetail.confirmpassword = confirmpassword;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		UserDetail.name = name;
	}

	public String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		UserDetail.email = email;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		UserDetail.password = password;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		UserDetail.username = username;
	}
	
	public String getconfirmpassword() {
		return confirmpassword;
	}

	public static void setconfirmpassword(String confirmpassword) {
		UserDetail.confirmpassword =confirmpassword;
	}

	public static void executeUpdate() {
		// TODO Auto-generated method stub
		
	}
}
