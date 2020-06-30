package com.example.SpringPilot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPilotApplication {
	
	// What are the beans? --> By using @Component
	// What are the dependencies of a bean? --> By using @AutoWired
	// Where to search for bean? => No need as package is same for all beans

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringPilotApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		
		System.out.println(result);
	}

}
