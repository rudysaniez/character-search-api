package com.me.work.search.api.mapper;

import org.mapstruct.Mapper;

@Mapper(uses= {DateMapper.class})
public interface SpellMapper {

	/**
	 * @param in
	 * @return {@link com.me.work.character.search.api.model.v1.Spell}
	 */
	public com.me.work.character.search.api.model.v1.Spell toModel(com.me.work.search.api.bo.Spell in);
	
	/**
	 * @param in
	 * @return {@link com.me.work.search.api.bo.Spell}
	 */
	public com.me.work.search.api.bo.Spell toBusinessObject(com.me.work.character.search.api.model.v1.Spell in);
}