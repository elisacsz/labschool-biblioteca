package com.futurodev.labschoolbiblioteca.controller;

import com.futurodev.labschoolbiblioteca.model.Book;
import com.futurodev.labschoolbiblioteca.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/livros")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> get(){
        return bookService.buscarLivros();
    }

    @PostMapping
    public Book post(@RequestBody Book book){
        return bookService.salvar(book);
    }

    @PutMapping
    public Book put(@RequestBody Book book){
        return bookService.salvar(book);
    }

    @DeleteMapping
    public boolean delete(@RequestBody Book book){
        bookService.excluir(book.getId());
        return true;
    }
}