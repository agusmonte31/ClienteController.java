package com.coderhouse.clientes.controller;


import com.coderhouse.clientes.dto.ClienteDto;
import com.coderhouse.clientes.model.Cliente;
import com.coderhouse.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

//Lista completa de clientes

@GetMapping("/lista")
public ResponseEntity<?> getAll() {

    return ResponseEntity.ok(this.clienteService.getAll());
}

//Clientes por dni junto con sus edades

    @GetMapping("/{dni}")
    public ClienteDto buscarPorDni(@PathVariable Long dni){
        return clienteService.buscarPorDni(dni);
    }
}
