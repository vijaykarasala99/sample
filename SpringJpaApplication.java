package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Book;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=
				SpringApplication.run(SpringJpaApplication.class, args);
		
		BookRepository repo = ctxt.getBean(BookRepository.class);
		
	   Book b=new Book();
	   b.setBookId(101);
	   b.setBookName("Spring");
	   b.setBookPrice(1000.00);
	  
	  repo.save(b);
	  
	   System.out.println("record inserted");
	   
	/*   Optional<Book> findById=repo.findById(101);
	   System.out.println(findById.get());
	  */ 
	   
	}

}
