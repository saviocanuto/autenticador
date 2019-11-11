package br.com.atendemed.autenticador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.atendemed.autenticador.dao.PerfilRepository;
import br.com.atendemed.autenticador.model.Perfil;

@Service
public class PerfilService {

	@Autowired
    PerfilRepository perfilRepository;

    public List<Perfil> listaPerfil() {
        return perfilRepository.findAll();
    }

    public Page<Perfil> listaPaginada(int count, int page) {
		PageRequest pages = PageRequest.of(page, count, Sort.Direction.ASC, "nome");
        return perfilRepository.findAll(pages);
    }

    public Perfil salvarPerfil(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    public void deletePerfil(String id) {
        perfilRepository.deleteById(id);
    }

    public Perfil getById(String id) {
        return perfilRepository.findById(id).get();
    }
    
    public List<Perfil> buscaPorNome(String nome) {
        return perfilRepository.findByNomeLikeIgnoreCase(nome);
    }
    
}
