package Spring2practise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestSpring {

	public static void main(String[] args) {

		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-config.xml");
		//			SpringService springService = new SpringService();
		SpringPractise service = (SpringPractise) context
				.getBean("springPractise");
		
		
		SpringErrorLog service2 = (SpringErrorLog) context
				.getBean("springErrorLog");
		
		service.setName("Ben");
		service.testPrint();
		
		service2.setErrorNumber(9906);
		service2.setErrortext("Broken");
		
		System.out.println(service2);
		System.out.println(service2.getErrortext() + " " + service2.getErrorNumber());
		
	//This is a change to initiate a Jenkins build	
	//This is a further change to initiate Jenkins
	}
}
