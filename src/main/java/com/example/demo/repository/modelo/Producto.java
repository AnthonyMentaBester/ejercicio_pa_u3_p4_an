package com.example.demo.repository.modelo;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "producto")
@Entity
public class Producto {


	    @GeneratedValue(generator = "seq_producto", strategy = GenerationType.SEQUENCE)
	    @SequenceGenerator(name = "seq_producto", sequenceName = "seq_producto",allocationSize = 1)
	    @Id
	    @Column(name = "prod_id")
	    private Integer id;
	    @Column(name="prod_cod_barras")
	    private String codigoBarras;
	    @Column(name="prod_nombre")
	    private String nombre;
	    @Column(name="prod_categoria")
	    private String categoria;
	    @Column(name = "prod_stock")
	    private Integer stock;
	    @Column(name="prod_precio")
	    private BigDecimal precio; 
	    
	    @OneToOne(mappedBy = "productos")
	    private DetalleFactura detalleFactura;

	    
	    //set y get
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getCodigoBarras() {
			return codigoBarras;
		}

		public void setCodigoBarras(String codigoBarras) {
			this.codigoBarras = codigoBarras;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public Integer getStock() {
			return stock;
		}

		public void setStock(Integer stock) {
			this.stock = stock;
		}

		public BigDecimal getPrecio() {
			return precio;
		}

		public void setPrecio(BigDecimal precio) {
			this.precio = precio;
		}

		public DetalleFactura getDetalleFactura() {
			return detalleFactura;
		}

		public void setDetalleFactura(DetalleFactura detalleFactura) {
			this.detalleFactura = detalleFactura;
		}
	    
	    
	    
}
	
