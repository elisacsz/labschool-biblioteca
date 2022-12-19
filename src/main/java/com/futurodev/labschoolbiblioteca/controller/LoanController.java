package com.futurodev.labschoolbiblioteca.controller;

import com.futurodev.labschoolbiblioteca.model.Loan;
import com.futurodev.labschoolbiblioteca.service.interfaces.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping
    public List<Loan> get(){
        return loanService.buscarEmprestimos();
    }

    @PostMapping
    public Loan post(@RequestBody Loan loan){
        return loanService.salvar(loan);
    }

    @PutMapping
    public Loan put(@RequestBody Loan loan){
        return loanService.salvar(loan);
    }

    @DeleteMapping
    public boolean delete(@RequestBody Loan loan){
        loanService.excluir(loan.getId());
        return true;
    }
}