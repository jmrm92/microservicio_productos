package com.master.producto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.producto.model.Producto;
import com.master.producto.service.ProductoService;

@RestController
public class ProductoController {
    
    @Autowired
    ProductoService service;

    @GetMapping (value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> obtenerProductos(){
        return service.productos();
    }

    @PutMapping (value = "/{codigoProducto}/{stock}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarStock(@PathVariable ("codigoProducto") int codigoProducto, @PathVariable ("stock") int stock){
        service.actualizarStock(codigoProducto, stock);
    }

    @GetMapping (value = "/{codigoProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
    public double obtenerPrecioProducto(@PathVariable ("codigoProducto") int codigoProducto){
        return service.obtenerPrecioProducto(codigoProducto);
    }
}
