package com.coderhouse.clientes.service.productos;

import com.coderhouse.clientes.model.Productos;

import java.util.Optional;

public interface ProductosService {
    Object getAll();

    Optional<Productos> buscarPorIdProductos(Long idProductos);

    Productos actualizarProductos(Productos productos);
}
