package com.master.producto.service;

import java.util.List;

import com.master.producto.model.Producto;

public interface ProductoService {
    List<Producto> productos();
    void actualizarStock(int codigoProducto, int stock);
    double obtenerPrecioProducto(int codigoProducto);
}
