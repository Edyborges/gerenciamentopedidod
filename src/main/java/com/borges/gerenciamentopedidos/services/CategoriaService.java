package com.borges.gerenciamentopedidos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.borges.gerenciamentopedidos.domain.Categoria;
import com.borges.gerenciamentopedidos.repositories.CategoriaRepository;
import com.borges.gerenciamentopedidos.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;	
	
	public Optional<Categoria> buscar(Integer id) {
	Optional<Categoria>	 obj = repo.findById(id);
	
	if(obj == null) {
		throw new ObjectNotFoundException("Objeto não encontrtado! Id: " + id
				+ ", Tipo:" +Categoria.class.getName());
	}
		return obj;
	}

}
