package br.com.magnasistemas.bicicletario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magnasistemas.bicicletario.configuration.BicicletarioConfig;
import br.com.magnasistemas.bicicletario.dto.BicicletarioDTO;
import br.com.magnasistemas.bicicletario.entity.Bicicletario;
import br.com.magnasistemas.bicicletario.repository.BicicletarioRepository;

@Service
public class BicicletarioService {

	@Autowired
	BicicletarioRepository repository;

	@Autowired
	BicicletarioConfig mapperBicicletario;

	public BicicletarioDTO postBicicletario(BicicletarioDTO biciletarioDTO) {
		repository.save(mapperBicicletario.toEntidade(biciletarioDTO));
		return biciletarioDTO;
	}

	public BicicletarioDTO getIdBicicletario(long id) {
		BicicletarioDTO bicicletarioDTO = null;
		Optional<Bicicletario> bicicletarioId = repository.findById(id);
		if (bicicletarioId.isPresent()) {
			Bicicletario bicicletario = bicicletarioId.get();
			bicicletarioDTO = mapperBicicletario.toModel(bicicletario);
			return bicicletarioDTO;
		}
		return null;

	}

	public Iterable<BicicletarioDTO> getBicicletario() {
		return mapperBicicletario.toListModel((List<Bicicletario>) repository.findAll());
	}

	public void deleteBicicletario(long id) {
		repository.deleteById(id);
	}

	public BicicletarioDTO putBicicletario(long id, BicicletarioDTO bicicletarioDTO) {
		Optional<Bicicletario> bicicletarioId = repository.findById(id);
		if (bicicletarioId.isPresent()) {
			Bicicletario entidade = mapperBicicletario.toEntidade(bicicletarioDTO);
			entidade.setId(id);
			repository.save(entidade);
			return bicicletarioDTO;
		}
		return null;
	}
}
