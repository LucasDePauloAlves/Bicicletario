package br.com.magnasistemas.bicicletario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magnasistemas.bicicletario.configuration.ClienteConfiguration;
import br.com.magnasistemas.bicicletario.dto.ClienteDTO;
import br.com.magnasistemas.bicicletario.entity.ClienteEntity;
import br.com.magnasistemas.bicicletario.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository repository;

	@Autowired
	ClienteConfiguration mapperCLiente;

	public ClienteDTO postCliente(ClienteDTO clienteDTO) {
		repository.save(mapperCLiente.toEntidade(clienteDTO));
		return clienteDTO;
	}

	public ClienteDTO getIdCliente(long id) {
		ClienteDTO clienteDTO = null;
		Optional<ClienteEntity> clienteId = repository.findById(id);
		if (clienteId.isPresent()) {
			ClienteEntity cliente = clienteId.get();
			clienteDTO = mapperCLiente.toModel(cliente);
			return clienteDTO;
		}
		return null;
	}

	public Iterable<ClienteDTO> getCliente() {
		return mapperCLiente.toListModel((List<ClienteEntity>) repository.findAll());
	}

	public void deleteCliente(long id) {
		repository.deleteById(id);
	}

	public ClienteDTO putCliente(long id, ClienteDTO clienteDTO) {
		Optional<ClienteEntity> clienteId = repository.findById(id);
		if (clienteId.isPresent()) {
			ClienteEntity entidade = mapperCLiente.toEntidade(clienteDTO);
			entidade.setId(id);
			repository.save(entidade);
			return clienteDTO;
		}
		return null;
	}
	
}
