package com.coderhouse.clientes.repository;

import com.coderhouse.clientes.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<Productos,Long> {}

