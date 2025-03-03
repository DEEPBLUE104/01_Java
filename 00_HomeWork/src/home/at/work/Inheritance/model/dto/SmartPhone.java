package home.at.work.Inheritance.model.dto;

public class SmartPhone extends Phone {

	private String operatingSystem;
	private int storageCapacity;
	
	public SmartPhone() {	}

	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	
	public void printInfo() {
		super.printInfo();
		System.out.println("Operationg System : " + operatingSystem);
		System.out.println("Storage Capacity : " + storageCapacity + "GB");
	
	}
	
}
