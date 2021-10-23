package br.com.magnasistemas.bicicletario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magnasistemas.bicicletario.entity.Bicicleta;

public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {

}
