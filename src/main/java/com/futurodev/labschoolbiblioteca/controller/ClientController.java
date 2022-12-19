package com.futurodev.labschoolbiblioteca.controller;

import com.futurodev.labschoolbiblioteca.model.Client;
import com.futurodev.labschoolbiblioteca.service.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> get() {
        return clientService.buscarClientes();
    }

    @PostMapping
    public Client post(@RequestBody Client client) {
        return clientService.salvar(client);
    }

    @PutMapping
    public Client put(@RequestBody Client client) {
        return clientService.salvar(client);
    }

    @DeleteMapping
    public boolean delete(@RequestBody Client client) {
        clientService.excluir(client.getId());
        return true;
    }
}