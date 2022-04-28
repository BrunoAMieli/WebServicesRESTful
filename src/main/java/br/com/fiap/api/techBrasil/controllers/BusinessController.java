package br.com.fiap.api.techBrasil.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.api.techBrasil.entity.Business;
import br.com.fiap.api.techBrasil.repository.BusinessRepository;

@RestController
@RequestMapping("/business")
public class BusinessController {

	@Autowired
	BusinessRepository businessRepository;
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Business cadastrarNegocio(@RequestBody Business business) {
		return businessRepository.save(business);
		
	}
	

	@GetMapping
	public List<Business> listarNegocio() {
		return businessRepository.findAll();
		
	}
	
	
	@GetMapping("{codigo}")
	public Business buscarNegocio(@PathVariable Long codigo) {
		return businessRepository.findById(codigo).get();
		
	}
	
	
	@DeleteMapping("{codigo}")
	public void removerNegocio(@PathVariable Long codigo) {
		businessRepository.deleteById(codigo);
		
	}
	
	
	@PutMapping("{id}")
	public Business atualizarNegocio(@RequestBody Business business, @PathVariable Long id) {
		business.setCodigo(id);
		return businessRepository.save(business);
		
	}
}
