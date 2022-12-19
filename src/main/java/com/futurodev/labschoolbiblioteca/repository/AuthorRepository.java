package com.futurodev.labschoolbiblioteca.repository;

import com.futurodev.labschoolbiblioteca.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository extends JpaRepository<Author, Long> {

    private static int indice = 1;
    private static List<Author> autores = new ArrayList<>();

    private int gerarId() {
        return indice++;
    }

    public Author save(Author author) {
        if (author.getId() == null) {
            author.setId(gerarId());
        } else {
            delete(author.getId());
        }
        autores.add(author);
        return author;
    }

    public Author findById(Integer id) {
