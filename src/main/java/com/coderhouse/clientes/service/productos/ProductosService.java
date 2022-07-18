package com.coderhouse.clientes.service.productos;

import com.coderhouse.clientes.model.Cliente;
import com.coderhouse.clientes.model.Productos;

import java.util.List;
import java.util.Optional;

public interface ProductosService {


    List<Productos> traerProductos();

    Productos nuevoProducto(Productos productos);

    static Productos actualizarProductos(Productos productos) {
        return null;
    }
    List<Productos> getAll();

    static Optional<Productos> buscarPorIdProductos(Long idProductos) {
        return null;
    }

    Productos crear(Productos productos);
}
