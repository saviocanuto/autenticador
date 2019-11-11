package br.com.atendemed.autenticador.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.atendemed.autenticador.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

	List<Usuario> findByNomeLikeIgnoreCase(String nome);
	
	List<Usuario> findByEmail(String email);
}
