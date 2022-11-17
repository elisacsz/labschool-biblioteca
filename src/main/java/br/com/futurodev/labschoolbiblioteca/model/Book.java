package br.com.futurodev.labschoolbiblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Long id;
    private String title;
    private Author author;
    private Integer quantity;
    private Double price;
}
