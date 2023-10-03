package com.master.producto.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.producto.model.Producto;

public interface ProductosDao extends JpaRepository <Producto, Integer> {
    
}
