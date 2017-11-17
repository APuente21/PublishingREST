package com.puente;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/books")
@Controller
public class BookController {
	private final Logger logger = LoggerFactory.getLogger(BookController.class);

    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        logger.info("Listing Book");

        List<Book> books = bookService.findAll();
        
        uiModel.addAttribute("books", books);

        logger.info("No. of books: " + books.size());

        return "books/list";
    }
   
    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

}
