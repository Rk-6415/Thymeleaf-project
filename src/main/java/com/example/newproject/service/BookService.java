package com.example.newproject.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.newproject.modal.Book;
import com.example.newproject.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public void saveBook(Book book) {
        bookRepository.save(book);
    }


    public Book getBookName(String title) {
        return bookRepository.findByTitle(title);
    }

 public List<Book> getBooksList() {
    return bookRepository.findAll();
}

public Book getupdate(Integer id) {
    return bookRepository.findById(id).orElse(null);
}
public void deleteBook(Integer id) {
    bookRepository.deleteById(id);
}

}