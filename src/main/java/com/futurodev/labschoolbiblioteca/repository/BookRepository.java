package com.futurodev.labschoolbiblioteca.repository;

import com.futurodev.labschoolbiblioteca.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public class BookRepository extends JpaRepository<Book, Long> {
}
