package interfacee;

public class BusinessMan implements Richman , SocialWorker {

	private String name;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void earnMoney() {
		System.out.println("I am rich man");
	}
	public void donation() {
		System.out.println("Giving donation");
	}
	public void party() {
		System.out.println("doing party everyday");
	}
	public void helpToOther() {
		System.out.println("Helping poor");
	}

	
}
