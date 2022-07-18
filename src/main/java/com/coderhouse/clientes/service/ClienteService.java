package com.coderhouse.clientes.service;

import com.coderhouse.clientes.dto.ClienteDto;
import com.coderhouse.clientes.model.Cliente;

import java.util.List;

public interface ClienteService {
    ClienteDto buscarPorDni(Long dni);
    List<Cliente> getAll();

    ClienteDto actualizarCliente(Cliente cliente);
}
