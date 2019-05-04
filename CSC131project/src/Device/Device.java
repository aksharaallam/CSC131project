package Device;

public class Device {
	
	//this is the device driver
	//most devices should have a name and an ID
	
	private String name, id;
	
	public Device(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	
	//setter methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	//getter methods
	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}
	
}
