package com.puente;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.google.common.collect.Lists;

@Repository
@Transactional
@Service("bookService")
public class BookServiceImp implements BookService{
	private BookRepository bookRepository;
	
    @Transactional(readOnly=true)
    public List<Book> findAll() {
        return Lists.newArrayList(bookRepository.findAll());
    }
    
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
	
}
