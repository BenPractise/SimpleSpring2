package Spring2practise;

import org.springframework.stereotype.Component;

@Component
public class SpringPractise {

	private String name;
	
	public SpringPractise() {

	}

	public void testPrint () {
		System.out.println("My second spring practise by " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
