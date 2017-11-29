package com.puente.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.puente.domain.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
}
