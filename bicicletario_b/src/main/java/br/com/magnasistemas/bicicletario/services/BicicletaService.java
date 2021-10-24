package br.com.magnasistemas.bicicletario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magnasistemas.bicicletario.configuration.BicicletaConfiguration;
import br.com.magnasistemas.bicicletario.dto.BicicletaDTO;
import br.com.magnasistemas.bicicletario.entity.BicicletaEntity;
import br.com.magnasistemas.bicicletario.repository.BicicletaRepository;

@Service
public class BicicletaService {

	@Autowired
	BicicletaRepository repository;
	
	@Autowired
	BicicletaConfiguration mapperBIcicleta;
	
	public BicicletaDTO postBicicleta(BicicletaDTO bicicletaDTO) {
		repository.save(mapperBIcicleta.toEntidade(bicicletaDTO));
		return bicicletaDTO;
	}
	
	public Iterable<BicicletaDTO> getBicicleta() {
		return mapperBIcicleta.toListModel((List<BicicletaEntity>) repository.findAll());
	}

	public void deleteBicicleta(long id) {
		repository.deleteById(id);
	}
	
	public BicicletaDTO getIdBicicleta(long id) {
		BicicletaDTO bicicletaDTO = null;
		
		Optional<BicicletaEntity> bicicletaId = repository.findById(id);
		BicicletaEntity bicicleta = bicicletaId.get();
		bicicletaDTO = mapperBIcicleta.toModel(bicicleta);
		return bicicletaDTO;
	}
	
	public BicicletaDTO putBicicleta(long id, BicicletaDTO bicicletaDTO) {
		Optional<BicicletaEntity> bicicletaId = repository.findById(id);
		if (bicicletaId.isPresent()) {
			BicicletaEntity entidade = mapperBIcicleta.toEntidade(bicicletaDTO);
			entidade.setId(id);
			repository.save(entidade);
			return bicicletaDTO;
		}
		return null;
	}
	
}
