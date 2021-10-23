package br.com.magnasistemas.bicicletario.configuration;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.magnasistemas.bicicletario.dto.ClienteDTO;
import br.com.magnasistemas.bicicletario.entity.Cliente;

@Configuration
public class ClienteConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}
	
	public ClienteDTO toModel(Cliente cliente){
		ModelMapper modelMapper = modelMapper();
		return modelMapper.map(cliente, ClienteDTO.class);
	}
	
	public Cliente toEntidade(ClienteDTO clienteDTO) {
		ModelMapper modelMapper = modelMapper();
		return modelMapper.map(clienteDTO, Cliente.class);
	}
	
	public List<ClienteDTO> toListModel(List<Cliente> clientes){
		return clientes.stream().map(clients -> toModel(clients)).collect(Collectors.toList());
	}
	
	
}
