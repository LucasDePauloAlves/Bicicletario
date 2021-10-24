package br.com.magnasistemas.bicicletario.configuration;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.magnasistemas.bicicletario.dto.BicicletarioDTO;
import br.com.magnasistemas.bicicletario.entity.BicicletarioEntity;

@Configuration
public class BicicletarioConfiguration {

	@Bean("mapperBicicletario")
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}

	public BicicletarioDTO toModel(BicicletarioEntity bicicletario) {
		ModelMapper modelMapper = modelMapper();
		return modelMapper.map(bicicletario, BicicletarioDTO.class);
	}

	public BicicletarioEntity toEntidade(BicicletarioDTO bicicletarioDTO) {
		ModelMapper modelMapper = modelMapper();
		return modelMapper.map(bicicletarioDTO, BicicletarioEntity.class);
	}

	public List<BicicletarioDTO> toListModel(List<BicicletarioEntity> bicicletarios) {
		return bicicletarios.stream().map(bicis -> toModel(bicis)).collect(Collectors.toList());
	}
}
