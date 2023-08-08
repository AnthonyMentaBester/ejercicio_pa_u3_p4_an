package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "detalle_factura")
@Entity
public class DetalleFactura {
	
	@GeneratedValue(generator = "seq_detalle_factura", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_detalle_factura", sequenceName = "seq_detalle_factura",allocationSize = 1)
    @Id
    @Column(name = "detf_id")
    private Integer id;
    @Column(name = "detf_cantidad")
    private Integer cantidad;
    @Column(name = "detf_precio_unitario")
    private BigDecimal precioUnitario;
    @Column(name = "detf_sub_total")
    private BigDecimal subTotal;
    @ManyToOne
    @JoinColumn(name = "detf_id_factura")
    private Factura factura;
    @OneToOne()
    @JoinColumn(name = "detf_id_producto")
    private Producto productos;
    
    //set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public BigDecimal getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Producto getProductos() {
		return productos;
	}
	public void setProductos(Producto productos) {
		this.productos = productos;
	}
    
    
   
 

}
