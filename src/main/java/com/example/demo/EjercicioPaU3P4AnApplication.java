package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.ProductoService;

@SpringBootApplication
public class EjercicioPaU3P4AnApplication implements CommandLineRunner {

	
	@Autowired
	public ProductoService productoService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Producto prod = new Producto();
			
			prod.setCategoria("B1");
			prod.setCodigoBarras("12423");
			prod.setDetalleFactura(null);
			prod.setNombre("Salchichas");
			prod.setPrecio(new BigDecimal(10));
			prod.setStock(4);
		this.productoService.ingresar(prod, 4);
		
	}
	
	
	

}
