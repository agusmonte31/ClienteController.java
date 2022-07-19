package com.coderhouse.clientes.service.productos;

import com.coderhouse.clientes.model.Productos;
import com.coderhouse.clientes.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductosServiceImpl implements ProductosService{
    @Autowired ProductosRepository productosRepository;

    @Override
    public Object getAll() {
        return productosRepository.findAll();
    }

    @Override
    public Optional<Productos> buscarPorIdProductos(Long idproductos) {
        return productosRepository.findById(idproductos);
    }

    @Override
    public Productos nuevoProducto(Productos productos) {
        return productosRepository.save(productos);
    }


    @Override
    public Productos actualizarProductos(Productos productos) {
        return productosRepository.save(productos);
    }
}
