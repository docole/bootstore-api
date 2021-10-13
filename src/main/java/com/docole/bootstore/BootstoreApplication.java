package com.docole.bootstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.docole.bootstore.domain.Categoria;
import com.docole.bootstore.domain.Livro;
import com.docole.bootstore.repositories.CategoriaRepository;
import com.docole.bootstore.repositories.LivroRepository2;

@SpringBootApplication
public class BootstoreApplication implements CommandLineRunner  {
	
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository2 livroRepository2;


	public static void main(String[] args) {
		SpringApplication.run(BootstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica", "Livro de Fi");

		Livro l1 = new Livro(null, "Clean code", "Robert Martins", "Loren iphuns", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository2.saveAll(Arrays.asList(l1));

	}

}
