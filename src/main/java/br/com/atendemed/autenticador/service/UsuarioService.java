package br.com.atendemed.autenticador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.atendemed.autenticador.dao.UsuarioRepository;
import br.com.atendemed.autenticador.model.Usuario;

@Service
public class UsuarioService {

	@Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> listaUsuario() {
        return usuarioRepository.findAll();
    }

    public Page<Usuario> listaPaginada(int count, int page) {
    	PageRequest pages = PageRequest.of(page, count, Sort.Direction.ASC, "nome");
        return usuarioRepository.findAll(pages);
    }

    public List<Usuario> buscaPorNome(String nome) {
        return usuarioRepository.findByNomeLikeIgnoreCase(nome);
    }

    public Usuario salvarUsuario(Usuario usuarioAdd) {
        return usuarioRepository.save(usuarioAdd);
    }

    public void deleteUsuario(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    public void deleteUsuario(String id) {
    	usuarioRepository.deleteById(id);
    }

    public Usuario getById(String id) {
        return usuarioRepository.findById(id).get();
    }
    
}
