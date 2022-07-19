package com.coderhouse.clientes.service.comprobantes;

import com.coderhouse.clientes.model.Comprobantes;
import com.coderhouse.clientes.repository.ComprobantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComprobantesServiceImpl implements ComprobantesService {
    @Autowired ComprobantesRepository comprobantesRepository;
    @Override
    public Comprobantes buscarPorIdComprobante(Long idComprobante) {
        return comprobantesRepository.findById(idComprobante).orElse(null);
    }

    @Override
    public Comprobantes crear(Comprobantes comprobantes) {
        return comprobantesRepository.save(comprobantes);
    }

    @Override
    public Comprobantes actualizarComprobantes(Comprobantes comprobantes) {
        return comprobantesRepository.save(comprobantes);
    }

    @Override
    public Object getAll() {
        return comprobantesRepository.findAll();
    }
}
