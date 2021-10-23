package br.com.magnasistemas.bicicletario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magnasistemas.bicicletario.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
