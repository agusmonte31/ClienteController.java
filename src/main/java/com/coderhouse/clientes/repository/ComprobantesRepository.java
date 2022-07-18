package com.coderhouse.clientes.repository;

import com.coderhouse.clientes.model.Cliente;
import com.coderhouse.clientes.model.Comprobantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprobantesRepository extends JpaRepository<Comprobantes,Long> {
}


