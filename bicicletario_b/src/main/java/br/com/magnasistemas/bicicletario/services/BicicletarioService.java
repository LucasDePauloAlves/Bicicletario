package br.com.magnasistemas.bicicletario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magnasistemas.bicicletario.configuration.BicicletarioConfiguration;
import br.com.magnasistemas.bicicletario.dto.BicicletarioDTO;
import br.com.magnasistemas.bicicletario.entity.BicicletarioEntity;
import br.com.magnasistemas.bicicletario.repository.BicicletarioRepository;

@Service
public class BicicletarioService {

	@Autowired
	BicicletarioRepository repository;

	@Autowired
	BicicletarioConfiguration mapperBicicletario;

	public BicicletarioDTO postBicicletario(BicicletarioDTO biciletarioDTO) {
		repository.save(mapperBicicletario.toEntidade(biciletarioDTO));
		return biciletarioDTO;
	}

	public BicicletarioDTO getIdBicicletario(long id) {
		BicicletarioDTO bicicletarioDTO = null;
		Optional<BicicletarioEntity> bicicletarioId = repository.findById(id);
		if (bicicletarioId.isPresent()) {
			BicicletarioEntity bicicletario = bicicletarioId.get();
			bicicletarioDTO = mapperBicicletario.toModel(bicicletario);
			return bicicletarioDTO;
		}
		return null;

	}

	public Iterable<BicicletarioDTO> getBicicletario() {
		return mapperBicicletario.toListModel((List<BicicletarioEntity>) repository.findAll());
	}

	public void deleteBicicletario(long id) {
		repository.deleteById(id);
	}

	public BicicletarioDTO putBicicletario(long id, BicicletarioDTO bicicletarioDTO) {
		Optional<BicicletarioEntity> bicicletarioId = repository.findById(id);
		if (bicicletarioId.isPresent()) {
			BicicletarioEntity entidade = mapperBicicletario.toEntidade(bicicletarioDTO);
			entidade.setId(id);
			repository.save(entidade);
			return bicicletarioDTO;
		}
		return null;
	}
}
