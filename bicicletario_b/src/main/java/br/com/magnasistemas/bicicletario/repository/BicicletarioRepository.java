package br.com.magnasistemas.bicicletario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magnasistemas.bicicletario.entity.BicicletarioEntity;

public interface BicicletarioRepository extends JpaRepository<BicicletarioEntity, Long>{

}
