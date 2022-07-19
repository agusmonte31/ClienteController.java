package com.coderhouse.clientes.controller;

import com.coderhouse.clientes.model.Comprobantes;
import com.coderhouse.clientes.service.comprobantes.ComprobantesService;
import com.coderhouse.clientes.service.productos.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/comprobantes")
public class ComprobanteController {

    @Autowired
    private ComprobantesService comprobantesService;
    public ComprobanteController(ComprobantesService comprobantesService) {
        this.comprobantesService =comprobantesService;
    }
//Lista completa de comprobantes

    @GetMapping("/lista")
    public ResponseEntity<?> getAll() {

        return ResponseEntity.ok(this.comprobantesService.getAll());
    }

//Comprobantes por Id

    @GetMapping("/{IdComprobantes}")
    public Comprobantes buscarPorIdComprobante(@PathVariable Long IdComprobante) {
        return comprobantesService.buscarPorIdComprobante(IdComprobante);
    }


    @PostMapping("/crear")
    public Comprobantes nuevoComprobante(@RequestBody Comprobantes comprobantes){
        return comprobantesService.crear(comprobantes);};

    @PutMapping("/actualizar")
    public Comprobantes actualizarComprobante(@RequestBody Comprobantes comprobantes){
        return comprobantesService.actualizarComprobantes(comprobantes);};
}
