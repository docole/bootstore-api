package com.docole.bootstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docole.bootstore.domain.Livro;


@Repository
public interface  LivroRepository2 extends JpaRepository<Livro, Integer> {
	
	

}
