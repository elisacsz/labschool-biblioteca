package br.com.futurodev.labschoolbiblioteca.controller;

import br.com.futurodev.labschoolbiblioteca.model.Author;
import br.com.futurodev.labschoolbiblioteca.service.AuthorService;
import model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AuthorService;

import java.util.List;

@RestController
@RequestMapping(value = "/autores")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> get(){
        return authorService.buscarAutores();
    }

    @PostMapping
    public Author post(@RequestBody Author author){
        return authorService.salvar(author);
    }

    @PutMapping
    public Author put(@RequestBody Author author){
        return authorService.salvar(author);
    }

    @DeleteMapping
    public boolean delete(@RequestBody Author author){
        authorService.excluir(author.getId());
        return true;
    }
}
