package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.model.Book;
import com.example.Bookstore.model.BookRepository;
import com.example.Bookstore.model.Category;
import com.example.Bookstore.model.CategoryRepository;
import com.example.Bookstore.model.Users;
import com.example.Bookstore.model.UserRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository, CategoryRepository crepository, UserRepository urepository) {
		return (args) -> {
			
			Category category1 = new Category("Fictional");
			Category category2 = new Category("Comedy");
			
			crepository.save(category1);
			crepository.save(category2);
			
			Book book1 = new Book ("Earnest Hemmingway", "A Farewell to Arms" , 1929, "123456-12",category1);	
			Book book2 = new Book ("Geogre Orwell", "Animal Farm" , 1945, "223456-51",category2);
			Users user1 = new Users("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			Users user2 = new Users("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			
			
			urepository.save(user1);
			urepository.save(user2);
			
			repository.save(book1);
			repository.save(book2);
			
			
		};
		
	} 
	
	

}
