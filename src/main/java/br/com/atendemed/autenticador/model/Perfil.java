package br.com.atendemed.autenticador.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;

@Document
public class Perfil implements GrantedAuthority {

	@Id
	@Getter @Setter
    private String id;

	@Getter @Setter
    private String nome;

	@Override
	public String getAuthority() {
		return nome;
	}
}
