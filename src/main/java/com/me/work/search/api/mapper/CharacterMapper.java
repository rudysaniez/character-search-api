package com.me.work.search.api.mapper;

import org.mapstruct.Mapper;

@Mapper(uses= {DateMapper.class})
public interface CharacterMapper {

	/**
	 * @param character
	 * @return {@link com.me.work.character.search.api.model.v1.Character}
	 */
	public com.me.work.character.search.api.model.v1.Character toModel(com.me.work.search.api.bo.Character character);
	
	/**
	 * @param character
	 * @return {@link com.me.work.character.search.api.model.EntityModelCharacter}
	 */
	public com.me.work.character.search.api.model.EntityModelCharacter toModelByContract(com.me.work.search.api.bo.Character character);
	
	/**
	 * @param character
	 * @return {@link com.me.work.search.api.bo.Character}
	 */
	public com.me.work.search.api.bo.Character toBussinessObject(com.me.work.character.search.api.model.v1.Character character);
}