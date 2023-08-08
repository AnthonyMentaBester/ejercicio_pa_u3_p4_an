package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Repository
@Transactional
public class ProductoRepositoryImpl  implements ProductoRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
		
	}

	@Override
	public List<Producto> buscarCodBarras(Producto producto) {
		// TODO Auto-generated method stub
		Query mQuery = this.entityManager.createQuery("SELECT Producto p FROM p.stock =:datoStock WHERE p.codigoBarras =:datoBarra");
        mQuery.setParameter("datoStock", producto.getStock());
        mQuery.setParameter("datoBarra", producto.getCodigoBarras());
        return mQuery.getResultList();
	
	}
	


	

}
