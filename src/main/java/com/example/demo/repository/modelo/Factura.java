package com.example.demo.repository.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "factura")
@Entity
public class Factura {
	
	@GeneratedValue(generator = "seq_factura", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_factura", sequenceName = "seq_factura",allocationSize = 1)
    @Id
    @Column(name = "fac_id")
    private Integer id;

    @Column(name="fac_fecha")
    private LocalDate fecha;
    @Column(name="fac_cedula")
    private String cedula;
    @Column(name="fac_total_factura")
    private Integer nombre;
   
    @OneToMany(mappedBy = "factura")
    private List<DetalleFactura> facturas;

    
    //set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Integer getNombre() {
		return nombre;
	}

	public void setNombre(Integer nombre) {
		this.nombre = nombre;
	}

	public List<DetalleFactura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<DetalleFactura> facturas) {
		this.facturas = facturas;
	}
    
    
    
 

}
