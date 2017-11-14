package com.puente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.google.common.collect.Lists;
import com.puente.domain.Book;
import com.puente.repository.BookRepository;

public class BookServiceImp implements BookService{
	private BookRepository bookRepository;
	
    @Transactional(readOnly=true)
    public List<Book> findAll() {
        return Lists.newArrayList(bookRepository.findAll());
    }
    
    @Autowired
    public void setBooktRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
	
}
