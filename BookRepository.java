package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Book;

public interface BookRepository extends CrudRepository <Book,Integer>{

}
