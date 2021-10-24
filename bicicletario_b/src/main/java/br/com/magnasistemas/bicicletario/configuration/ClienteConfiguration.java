package br.com.magnasistemas.bicicletario.configuration;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.magnasistemas.bicicletario.dto.BicicletaDTO;
import br.com.magnasistemas.bicicletario.dto.ClienteDTO;
import br.com.magnasistemas.bicicletario.entity.ClienteEntity;

@Configuration
public class ClienteConfiguration {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}
	
	public ClienteDTO toModel(ClienteEntity cliente){
		ModelMapper modelMapper = modelMapper();
		return modelMapper.map(cliente, ClienteDTO.class);
	}
	
	public ClienteEntity toEntidade(ClienteDTO clienteDTO) {
		ModelMapper modelMapper = modelMapper();
		return modelMapper.map(clienteDTO, ClienteEntity.class);
	}
	
	public List<ClienteDTO> toListModel(List<ClienteEntity> clientes){
		return clientes.stream().map(clients -> toModel(clients)).collect(Collectors.toList());
	}
	
	//public List<BicicletaDTO>
	
	//List<BicicletaDTO> transporteBicicleta
	
}
