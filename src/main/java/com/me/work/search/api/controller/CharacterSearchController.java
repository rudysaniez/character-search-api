package com.me.work.search.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.me.work.character.search.api.model.v1.Character;
import com.me.work.search.api.Api;
import com.me.work.search.api.mapper.CharacterMapper;
import com.me.work.search.api.repository.CharacterRepository;

@CrossOrigin
@RestController
public class CharacterSearchController {

	@Autowired
	private CharacterRepository characterRepository;
	
	@Autowired
	private CharacterMapper characterMapper;
	
	/**
	 * @param name
	 * @param assembler
	 * @param page
	 * @return page of {@link Character}
	 */
	@GetMapping(value=Api.CHARACTER_PATH)
	public ResponseEntity<PagedModel<EntityModel<Character>>> find(@RequestParam(name="name", required=false) String name, 
			PagedResourcesAssembler<Character> assembler, Pageable page) {
	
		Page<com.me.work.search.api.bo.Character> pageOfCharacters = null;
		
		if(StringUtils.isEmpty(name)) {
			
			pageOfCharacters = this.characterRepository.findAll(page);
			
			return ResponseEntity.status(HttpStatus.FOUND).body(assembler.toModel(pageOfCharacters.map(this.characterMapper::toModel)));
		}
		else {
			
			pageOfCharacters = this.characterRepository.findByName(name, page);
			
			return ResponseEntity.status(HttpStatus.FOUND).body(assembler.toModel(pageOfCharacters.map(this.characterMapper::toModel)));
		}
	}
}