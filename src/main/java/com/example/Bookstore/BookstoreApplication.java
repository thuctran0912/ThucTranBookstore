package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.model.Book;
import com.example.Bookstore.model.BookRepository;
import com.example.Bookstore.model.Category;
import com.example.Bookstore.model.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository, CategoryRepository crepository) {
		return (args) -> {
			
			Category category1 = new Category("Fictional");
			Category category2 = new Category("Comedy");
			
			crepository.save(category1);
			crepository.save(category2);
			
			repository.save(new Book ("Earnest Hemmingway", "A Farewell to Arms" , 1929, "123456-12",category1));	
			repository.save(new Book ("Geogre Orwell", "Animal Farm" , 1945, "223456-51",category2));
			

		};
		
	} 
	
	

}
