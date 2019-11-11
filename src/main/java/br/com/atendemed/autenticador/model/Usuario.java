package br.com.atendemed.autenticador.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
public class Usuario {

	@Id
	@Getter @Setter
    private String id;

	@Getter @Setter
    private String nome;

	@DBRef
	@Getter @Setter
    private List<Perfil> perfis;

	@Getter @Setter
    private int idade;

	@Getter @Setter
    private String email;

	public Usuario() {
	}

	public Usuario(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.perfis = usuario.getPerfis();
		this.idade = usuario.getIdade();
		this.email = usuario.getEmail();
	}
    
}
