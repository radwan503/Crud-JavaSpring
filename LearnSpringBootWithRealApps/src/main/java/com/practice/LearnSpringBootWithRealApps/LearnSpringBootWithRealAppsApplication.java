package com.practice.LearnSpringBootWithRealApps;

import com.practice.LearnSpringBootWithRealApps.entitiy.Product;
import com.practice.LearnSpringBootWithRealApps.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootWithRealAppsApplication  implements CommandLineRunner{

	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootWithRealAppsApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		for(Product product : productRepository.findAll()){
			System.out.println("Id "+product.getId());
			System.out.println("name "+product.getName());
			System.out.println("price "+product.getPrice());
			System.out.println("quantity "+product.getQuantity());
			System.out.println("description "+product.getDescription());
			System.out.println("photo "+product.getPhoto());
			System.out.println("feature "+product.isFeature());
			System.out.println("================================");
			
		}

	}
}
