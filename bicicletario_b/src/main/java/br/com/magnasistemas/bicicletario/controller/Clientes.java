package br.com.magnasistemas.bicicletario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.magnasistemas.bicicletario.dto.ClienteDTO;
import br.com.magnasistemas.bicicletario.services.ClienteService;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Clientes {

	@Autowired
	ClienteService clienteService;

	@GetMapping("/Clientes")
	public Iterable<ClienteDTO> GetClientes() {
		return clienteService.getCliente();

	}

	@GetMapping("/Clientes/{id}")
	public ResponseEntity<ClienteDTO> getId(@PathVariable Long id) {
		ClienteDTO clienteDTO = clienteService.getIdCliente(id);
		return new ResponseEntity<>(clienteDTO, HttpStatus.OK);
	}

	@PostMapping("/Clientes")
	public ResponseEntity<ClienteDTO> post(@RequestBody ClienteDTO clienteDTO) {
		clienteDTO = clienteService.postCliente(clienteDTO);
		return new ResponseEntity<>(clienteDTO, HttpStatus.CREATED);
	}

	@DeleteMapping("Clientes/{id}")
	public ResponseEntity<ClienteDTO> deleteId(@PathVariable Long id) {
		clienteService.deleteCliente(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/Clientes/{id}")
	public ResponseEntity<ClienteDTO> putId(@PathVariable Long id, @RequestBody ClienteDTO clienteDTO) {
		clienteService.putCliente(id, clienteDTO);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
