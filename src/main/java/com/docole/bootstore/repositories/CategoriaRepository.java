package com.docole.bootstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docole.bootstore.domain.Categoria;


@Repository
public interface  CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
	

}
