package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ProductoRepository;
import com.example.demo.repository.modelo.Producto;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void ingresar(Producto producto, Integer stock) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Producto prodBarras = (Producto) this.productoRepository.buscarCodBarras(producto);
		Producto prod = new Producto();

		if (prodBarras == null) {
			
			prod.setCategoria("B1");
			prod.setCodigoBarras(prodBarras.getCodigoBarras());
			prod.setDetalleFactura(null);
			prod.setNombre("Salchichas");
			prod.setPrecio(new BigDecimal(10));
			prod.setStock(stock);
			
			this.productoRepository.insertar(producto);
		} else {
			Integer StockActual = prodBarras.getStock() + stock;
			prod.setStock(StockActual);
			this.productoRepository.insertar(producto);
		}

	}

}
