package com.example.newproject.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.newproject.modal.Book;
import com.example.newproject.service.BookService;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


     @GetMapping("/test")
    public String getList() {
        return "List of EagleRaj";
    }

    @GetMapping("/getBook/{bookName}")
    public ResponseEntity<Book> getBookByName(
            @PathVariable String bookName) {

        Book bookByName = bookService.getBookName(bookName);

        return ResponseEntity.ok(bookByName);
    }
}