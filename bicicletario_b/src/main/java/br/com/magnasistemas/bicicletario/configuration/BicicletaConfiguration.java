package br.com.magnasistemas.bicicletario.configuration;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.magnasistemas.bicicletario.dto.BicicletaDTO;
import br.com.magnasistemas.bicicletario.entity.BicicletaEntity;

@Configuration
public class BicicletaConfiguration {

	@Bean("MapperBicicelta")
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}
	
	public BicicletaDTO toModel(BicicletaEntity bicicleta){
		ModelMapper modelMapper = modelMapper();
		return modelMapper.map(bicicleta, BicicletaDTO.class);
	}
	
	public BicicletaEntity toEntidade(BicicletaDTO bicicletaDTO) {
		ModelMapper modelMapper = modelMapper();
		return modelMapper.map(bicicletaDTO, BicicletaEntity.class);
	}
	
	public List<BicicletaDTO> toListModel(List<BicicletaEntity> bicicletas){
		return bicicletas.stream().map(biciclets -> toModel(biciclets)).collect(Collectors.toList());
	}
	
}
