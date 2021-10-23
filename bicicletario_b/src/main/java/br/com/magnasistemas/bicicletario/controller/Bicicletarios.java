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
import org.springframework.web.bind.annotation.RestController;

import br.com.magnasistemas.bicicletario.dto.BicicletarioDTO;
import br.com.magnasistemas.bicicletario.services.BicicletarioService;

@RestController
public class Bicicletarios {
	
	@Autowired
	BicicletarioService bicicletarioService;


	@GetMapping("/Bicicletarios")
	public Iterable<BicicletarioDTO> GetBicicletarios() {
		return bicicletarioService.getBicicletario();

	}

	@GetMapping("/Bicicletarios/{id}")
	public ResponseEntity<BicicletarioDTO> getId(@PathVariable Long id) {
		BicicletarioDTO bicicletarioDTO = bicicletarioService.getIdBicicletario(id);
		return new ResponseEntity<>(bicicletarioDTO, HttpStatus.OK);
	}

	@PostMapping("/Bicicletarios")
	public ResponseEntity<BicicletarioDTO> post(@RequestBody BicicletarioDTO bicicletarioDTO) {
		bicicletarioDTO = bicicletarioService.postBicicletario(bicicletarioDTO);
		return new ResponseEntity<>(bicicletarioDTO, HttpStatus.CREATED);
	}

	@DeleteMapping("/Bicicletarios/{id}")
	public ResponseEntity<BicicletarioDTO> deleteId(@PathVariable Long id) {
		bicicletarioService.deleteBicicletario(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/Bicicletarios/{id}")
	public ResponseEntity<BicicletarioDTO> putId(@PathVariable Long id, @RequestBody BicicletarioDTO bicicletarioDTO) {
		bicicletarioService.putBicicletario(id, bicicletarioDTO);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
