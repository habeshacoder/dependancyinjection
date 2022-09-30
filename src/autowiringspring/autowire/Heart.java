package autowiringspring.autowire;

public class Heart {
	private String name;
	private String size;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	private void pumping() {

		System.out.println("heart is pumping ...");

	}

}
