package server;


/**
 * 
 * this is the user class
 * @author austinwilson
 *
 */
public class User {
	private static String Fname;
	private static String Lname; 
	private static int id;
	private Device device;
	public User(String Fname,String Lname, int id) {
		this.Fname = Fname;
		this.Lname = Lname; 
		this.id = id; 
	}
	
	
	public void setFirstName(String Fname) {
		this.Fname = Fname;
	}
	public void setLastName(String Lname)
	{
		this.Lname = Lname; 
	}
	
	public void setId(int Id) {
		this.id = Id;
	}
	public void setDevice(String name,String ID,String location) {
		device  = new Device(name,ID,location);
	}
	
	//getters
	public static String getFirstName() {
		return Fname;
	}
	public static String getLastName() {
		return Lname;
	}
	public static int getId() {
		return id;
	}
	public String getInformation()
	{
		return this.Fname;
		//return this.Lname;
		//return this.id; 
	}
	public Device getDevice() {
		return this.device;
	}
}

	
