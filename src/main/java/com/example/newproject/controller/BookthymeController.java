package com.example.newproject.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.newproject.modal.Book;
import com.example.newproject.service.BookService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BookthymeController {

    private final BookService bookService;

    public BookthymeController(BookService bookService) {
        this.bookService = bookService;
    }



@GetMapping("/getBooksList")
    public String getBooksList(Model model) {

        
        List<Book> bookByName = bookService.getBooksList();

        model.addAttribute("books", bookByName);

        return "booklist";
    }

    @GetMapping("/getBooks/{bookName}")
    public String getBookByName(
            @PathVariable String bookName,
            Model model) {

        Book bookByName = bookService.getBookName(bookName);

        model.addAttribute("books", bookByName);

        return "booklist";
    }

 @GetMapping("/addBook")
public String showAddBookForm(Model model) {

    model.addAttribute("book", new Book());

    return "addbook";
}


@PostMapping("/addBook")
public String addBook(@ModelAttribute("book") Book book) {

    bookService.saveBook(book);

    return "redirect:/getBooksList";
}


@GetMapping("/editBook/{id}")
public String showEditBookForm(
        @PathVariable Integer id,
        Model model) {

    Book book = bookService.getupdate(id);

    model.addAttribute("book", book);

    return "addbook";
}


@PostMapping("/editBook/{id}")
public String updateBook(
        @PathVariable Integer id,
        @ModelAttribute("book") Book book) {

    book.setId(id);

    bookService.saveBook(book);

    return "redirect:/getBooksList";
}

@GetMapping("/deleteBook/{id}")
public String deleteBook(@PathVariable Integer id) {

    bookService.deleteBook(id);

    return "redirect:/getBooksList";
}



}