package br.com.magnasistemas.bicicletario.configuration;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.magnasistemas.bicicletario.dto.BicicletaDTO;
import br.com.magnasistemas.bicicletario.entity.Bicicleta;

@Configuration
public class BicicletaConfig {

	@Bean("MapperBicicelta")
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}
	
	public BicicletaDTO toModel(Bicicleta bicicleta){
		ModelMapper modelMapper = modelMapper();
		return modelMapper.map(bicicleta, BicicletaDTO.class);
	}
	
	public Bicicleta toEntidade(BicicletaDTO bicicletaDTO) {
		ModelMapper modelMapper = modelMapper();
		return modelMapper.map(bicicletaDTO, Bicicleta.class);
	}
	
	public List<BicicletaDTO> toListModel(List<Bicicleta> bicicletas){
		return bicicletas.stream().map(biciclets -> toModel(biciclets)).collect(Collectors.toList());
	}
	
}
