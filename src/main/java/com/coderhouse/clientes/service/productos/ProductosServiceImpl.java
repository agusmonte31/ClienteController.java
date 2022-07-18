package com.coderhouse.clientes.service.productos;

import com.coderhouse.clientes.model.Productos;
import com.coderhouse.clientes.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductosServiceImpl implements ProductosService {
    @Autowired
    private ProductosRepository repository;

    Productos productos;

    @Override
    public Optional<Productos> buscarPorIdProductos(Long dni) {
        Long IdProductos = null;
        assert IdProductos != null;
        productos= repository.findById(IdProductos).orElse(null);

        return repository.findById(IdProductos);
    }

    @Override
    public Productos actualizarProductos(Productos productos) {
        return null;
    }


    @Override
    public List<Productos> getAll() {
        return repository.findAll();
    }

    }

