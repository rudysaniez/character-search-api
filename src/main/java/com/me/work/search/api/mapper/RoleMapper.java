package com.me.work.search.api.mapper;

import org.mapstruct.Mapper;

@Mapper(uses=DateMapper.class)
public interface RoleMapper {

	/**
	 * @param in
	 * @return {@link com.me.work.search.api.bo.Role}
	 */
	public com.me.work.search.api.bo.Role toBusinessObject(com.me.work.character.search.api.model.v1.Role in);
	
	/**
	 * @param in
	 * @return {@link com.me.work.character.search.api.model.v1.Role}
	 */
	public com.me.work.character.search.api.model.v1.Role toModel(com.me.work.search.api.bo.Role in);
}