package com.master.producto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.producto.dao.ProductosDao;
import com.master.producto.model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    ProductosDao dao;
    
    /**
    * Recupera la lista de productos.
    * 
    * @return Lista de objetos Producto.
    */
   @Override
   public List<Producto> productos() {
       return dao.findAll();
   }
   
   /**
    * Actualiza el stock de un producto.
    * 
    * @param codigoProducto El código del producto.
    * @param stock          El nuevo valor del stock.
    */
   @Override
   public void actualizarStock(int codigoProducto, int stock) {
       Producto producto = dao.findById(codigoProducto).get();
       producto.setStock(stock);
       dao.save(producto);
   }
   
   /**
    * Recupera el precio de un producto.
    * 
    * @param codigoProducto El código del producto.
    * @return El precio del producto.
    */
   @Override
   public double obtenerPrecioProducto(int codigoProducto) {
       return dao.findById(codigoProducto).get().getPrecioUnitario();
   }
    
}
