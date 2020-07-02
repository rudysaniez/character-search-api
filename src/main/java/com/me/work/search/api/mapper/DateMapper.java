package com.me.work.search.api.mapper;

import java.time.OffsetDateTime;
import java.util.Date;

public class DateMapper {

	/**
	 * @param source
	 * @return {@link OffsetDateTime}
	 */
	public OffsetDateTime map(Date source) {
		
		OffsetDateTime out = null;
		
		if(source != null)
			out = com.me.work.search.api.converter.OffsetDateConverter.convert(source);
		
		return out;
	}
	
	/**
	 * @param source
	 * @return {@link Date}
	 */
	public Date map(OffsetDateTime source) {
		
		Date out = null;
		
		if(source != null)
			out = com.me.work.search.api.converter.OffsetDateConverter.convert(source);
		
		return out;
	}
}