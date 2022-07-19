package com.coderhouse.clientes.service;

import com.coderhouse.clientes.dto.ClienteDto;
import com.coderhouse.clientes.model.Cliente;
import com.coderhouse.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service

public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository repository;

    Cliente cliente;
    int edad;
    @Override
    public ClienteDto buscarPorDni(Long dni) {
        cliente= repository.findById(dni).orElse(null);
         edad=calcularedad(cliente);

        ClienteDto clienteAMostrar=new ClienteDto(cliente.getDni(),cliente.getNombre(),cliente.getApellido(),edad);
            return clienteAMostrar;
        }

        //Edad de cada cliente
    private int calcularedad(Cliente cliente) {
        Date fecha=cliente.getFechaNacimiento();
        String fechaString=fecha.toString();
        int anio = Integer.parseInt(fechaString.substring(0,4));
        int mes = Integer.parseInt(fechaString.substring(5,7));
        int dia = Integer.parseInt(fechaString.substring(8,10));
        int edad = Period.between(LocalDate.of(anio,mes,dia),LocalDate.now()).getYears();
        return edad;
    }


    @Override
    public List<Cliente> getAll() {
        return repository.findAll();
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public Object nuevoCliente(Cliente cliente) {
        return repository.save(cliente);
    }
}
