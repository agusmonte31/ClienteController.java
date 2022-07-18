package com.coderhouse.clientes.service.productos;

import com.coderhouse.clientes.model.Productos;
import com.coderhouse.clientes.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductosServiceImpl implements ProductosService {
    @Autowired
    private ProductosRepository repository;
    Productos productos;

    @Override
    public List<Productos> getAll() {return repository.findAll();
    }

    @Override
    public Productos crear(Productos productos) {
        return productos;
    }


    @Override
    public List<Productos> traerProductos() {
        return null;
    }

    @Override
    public Productos nuevoProducto(Productos productos){ return productos;}
    public Productos actualizarProductos(Productos productos){ return productos;
    }

}

