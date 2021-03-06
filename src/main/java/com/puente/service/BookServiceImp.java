package com.puente.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.google.common.collect.Lists;
import com.puente.domain.Book;
import com.puente.repository.BookRepository;

@Repository
@Transactional
@Service("bookService")
public class BookServiceImp implements BookService{
	private BookRepository bookRepository;
	
    @Transactional(readOnly=true)
    public List<Book> findAll() {
        return Lists.newArrayList(bookRepository.findAll());
    }

    @Transactional(readOnly=true)
    public Book findById(Long id) {
        return bookRepository.findOne(id);
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Autowired
    public void setContactRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional(readOnly=true)
    public Page<Book> findAllByPage(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

}
