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

import br.com.magnasistemas.bicicletario.dto.BicicletaDTO;
import br.com.magnasistemas.bicicletario.services.BicicletaService;

@RestController
public class BicicletaController {

	@Autowired
	BicicletaService bicicletaService;
	
	@GetMapping("/Bicicletas")
	public Iterable<BicicletaDTO> GetBicicletas(){
		return bicicletaService.getBicicleta();
	}

	@GetMapping("/Bicicletas/{id}")
	public ResponseEntity<BicicletaDTO> getId(@PathVariable Long id) {
		BicicletaDTO bicicletaDTO = bicicletaService.getIdBicicleta(id);
		return new  ResponseEntity<>(bicicletaDTO, HttpStatus.CREATED);
	}
	
	@PostMapping("/Bicicletas")
	public ResponseEntity<BicicletaDTO> post(@RequestBody BicicletaDTO bicicletaDTO) {
		bicicletaDTO = bicicletaService.postBicicleta(bicicletaDTO);
		return new ResponseEntity<>(bicicletaDTO, HttpStatus.CREATED);
	}
	
	@PutMapping("/Bicicletas/{id}")
	public ResponseEntity<BicicletaDTO> putId(@PathVariable Long id, @RequestBody BicicletaDTO bicicletaDTO ) {
		bicicletaService.putBicicleta(id, bicicletaDTO);
		return new  ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("Bicicletas/{id}")
	public ResponseEntity<BicicletaDTO> deleteId(@PathVariable Long id) {
		bicicletaService.deleteBicicleta(id);
		return new  ResponseEntity<>(HttpStatus.OK);
	}
}
