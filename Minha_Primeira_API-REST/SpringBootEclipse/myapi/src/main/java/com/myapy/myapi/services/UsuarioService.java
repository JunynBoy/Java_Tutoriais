package com.myapy.myapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.myapy.myapi.domain.Usuario;
import com.myapy.myapi.repositories.UsuarioRepository;
import com.myapy.myapi.services.exceptions.ObjectNotFoundException;



@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(
				() -> new ObjectNotFoundException("Objeto " + id + " não encontrado, Tipo: " + Usuario.class.getName()));
	}

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	public Usuario update(Integer id, Usuario obj) {
		Usuario newObj = findById(id);
		newObj.setNome(obj.getNome());
		newObj.setLogin(obj.getLogin());
		newObj.setLogin(obj.getSenha());
		return repository.save(newObj);
	}

	public Usuario create(Usuario obj) {
		 obj.setId(null);
		 return repository.save(obj);
	}

	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}
	
	
	
	
}
