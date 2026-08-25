package com.example.newproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.newproject.modal.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findByTitle(String title);
}