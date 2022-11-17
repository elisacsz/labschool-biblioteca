package br.com.futurodev.labschoolbiblioteca.repository;

import model.Author;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {

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
        if (id == null)
            return null;
        for (Author author : autores) {
            if (id.equals(author.getId())) {
                return author;
            }
        }
        return null;
    }

    public List<Author> findAll() {
        return autores;
    }

    public void delete(Integer id) {
        try {
            Author authorOld = findById(id);
            autores.remove(authorOld);
        } catch (Exception ignorado) {
        }
    }

}