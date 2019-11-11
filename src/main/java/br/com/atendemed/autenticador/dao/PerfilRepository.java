package br.com.atendemed.autenticador.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.atendemed.autenticador.model.Perfil;

public interface PerfilRepository extends MongoRepository<Perfil, String> {
	
	List<Perfil> findByNomeLikeIgnoreCase(String nome);
}
