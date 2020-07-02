package com.me.work.search.api.mapper;

import org.mapstruct.Mapper;

@Mapper(uses= {DateMapper.class})
public interface LifeMapper {

	/**
	 * @param life
	 * @return {@link com.me.work.character.search.api.model.v1.Life}
	 */
	public com.me.work.character.search.api.model.v1.Life toModel(com.me.work.search.api.bo.Life life);
	
	/**
	 * @param life
	 * @return {@link com.me.work.search.api.bo.Life}
	 */
	public com.me.work.search.api.bo.Life toBusinessObject(com.me.work.character.search.api.model.v1.Life life);
}