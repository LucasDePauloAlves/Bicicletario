package br.com.magnasistemas.bicicletario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magnasistemas.bicicletario.entity.Bicicletario;

public interface BicicletarioRepository extends JpaRepository<Bicicletario, Long>{

}
