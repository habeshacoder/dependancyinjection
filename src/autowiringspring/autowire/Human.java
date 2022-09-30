package autowiringspring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("lionheart")
	private Heart heart;
	
	
	public void displayhear() {
		
		System.out.println(" human heart is running ...");
		System.out.println("name : "+heart.getName() +" "+"id :"+heart.getSize());
	}
	
}
