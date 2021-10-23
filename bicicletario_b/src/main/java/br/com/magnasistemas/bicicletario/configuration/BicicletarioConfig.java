package br.com.magnasistemas.bicicletario.configuration;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.magnasistemas.bicicletario.dto.BicicletarioDTO;
import br.com.magnasistemas.bicicletario.entity.Bicicletario;

@Configuration
public class BicicletarioConfig {

	@Bean("mapperBicicletario")
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}

	public BicicletarioDTO toModel(Bicicletario bicicletario) {
		ModelMapper modelMapper = modelMapper();
		return modelMapper.map(bicicletario, BicicletarioDTO.class);
	}

	public Bicicletario toEntidade(BicicletarioDTO bicicletarioDTO) {
		ModelMapper modelMapper = modelMapper();
		return modelMapper.map(bicicletarioDTO, Bicicletario.class);
	}

	public List<BicicletarioDTO> toListModel(List<Bicicletario> bicicletarios) {
		return bicicletarios.stream().map(bicis -> toModel(bicis)).collect(Collectors.toList());
	}
}
