package com.coderhouse.clientes.controller;

import com.coderhouse.clientes.model.Productos;
import com.coderhouse.clientes.service.productos.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/productos")
public class ProductosController {


    @Autowired
    private ProductosService productosService;

    public ProductosController(ProductosService productosService) {
        this.productosService = productosService;
    }

//Lista completa de productos

    @GetMapping("/lista")
    public ResponseEntity<?> getAll() {

        return ResponseEntity.ok(this.productosService.getAll());
    }

//Productos por Id

    @GetMapping("/{IdProductos}")
    public Optional<Productos> buscarPorIdproductos(@PathVariable Long Idproductos) {
        return productosService.buscarPorIdProductos(Idproductos);
    }


    @PostMapping("/crear")
    public Productos nuevoProducto(@RequestBody Productos productos){
        return (Productos) productosService;};

    @PostMapping("/actualizar")
    public Productos actualizarProductos(@RequestBody Productos productos){
        return productosService.actualizarProductos(productos);}
}
