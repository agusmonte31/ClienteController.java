package com.coderhouse.clientes.service.comprobantes;

import com.coderhouse.clientes.model.Comprobantes;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ComprobantesService {
    Comprobantes buscarPorIdComprobante(Long idComprobante);

    Comprobantes crear(Comprobantes comprobantes);

    Comprobantes actualizarComprobantes(Comprobantes comprobantes);

    Object getAll(); }


