package TrackingPhoneSystem;

public class Information {

private static String serialNo;
private static String imeiNo;
private static String name;
private static String phoneNo;
private static String Email;
private static String gender;
private static String address;
	
	public Information(String serialNo, String imeiNo, String name, String phoneNo, String email, String gender,
			String address) {
		super();
		this.serialNo = serialNo;
		this.imeiNo = imeiNo;
		this.name = name;
		this.phoneNo = phoneNo;
		Email = email;
		this.gender = gender;
		this.address = address;
	}

	public static String getSerialNo() {
		return serialNo;
	}

	public static void setSerialNo(String serialNo) {
		Information.serialNo = serialNo;
	}

	public static String getImeiNo() {
		return imeiNo;
	}

	public static void setImeiNo(String imeiNo) {
		Information.imeiNo = imeiNo;
	}

	public String getName() {
		return name;
	}

	public static void setName(String name) {
		Information.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public static void setPhoneNo(String phoneNo) {
		Information.phoneNo = phoneNo;
	}

	public String getEmail() {
		return Email;
	}

	public static void setEmail(String email) {
		Information.Email = email;
	}

	public String getGender() {
		return gender;
	}

	public static void setGender(String gender) {
		Information.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		Information.address = address;
	}
	
}

