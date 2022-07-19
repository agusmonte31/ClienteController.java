package com.coderhouse.clientes.service.productos;

import com.coderhouse.clientes.model.Productos;

import java.util.Optional;

public interface ProductosService {

    Object getAll();

    Optional<Productos> buscarPorIdProductos(Long idproductos);

    Productos nuevoProducto(Productos productos);

    Productos actualizarProductos(Productos productos);
}

