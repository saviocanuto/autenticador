package br.com.atendemed.autenticador.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.atendemed.autenticador.config.MyUserDetails;
import br.com.atendemed.autenticador.dao.UsuarioRepository;
import br.com.atendemed.autenticador.model.Usuario;

@Service
public class MyUserDatailService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioRepository.findByEmail(email).get(0);
		
		if ( usuario == null ) {
			throw new UsernameNotFoundException("Usuario ou senha invalido");
		}
		return new MyUserDetails(usuario);
	}

}
