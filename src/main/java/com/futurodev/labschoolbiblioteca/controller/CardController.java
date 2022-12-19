package com.futurodev.labschoolbiblioteca.controller;

import com.futurodev.labschoolbiblioteca.model.Book;
import com.futurodev.labschoolbiblioteca.model.Card;
import com.futurodev.labschoolbiblioteca.service.interfaces.BookService;
import com.futurodev.labschoolbiblioteca.service.interfaces.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartoes")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping
    public List<Card> get(){
        return cardService.buscarCartoes();
    }

    @PostMapping
    public Card post(@RequestBody Card card){
        return cardService.salvar(card);
    }

    @PutMapping
    public Card put(@RequestBody Card card){
        return cardService.salvar(card);
    }

    @DeleteMapping
    public boolean delete(@RequestBody Card card){
        cardService.excluir(card.getId());
        return true;
    }
}
