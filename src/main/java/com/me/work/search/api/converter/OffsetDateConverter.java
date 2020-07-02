package com.me.work.search.api.converter;

import java.time.OffsetDateTime;
import java.util.Date;

import org.springframework.validation.annotation.Validated;

@Validated
public class OffsetDateConverter {

	/**
	 * @param in
	 * @return {@link java.time.OffsetDateTime}
	 */
	public static java.time.OffsetDateTime convert(Date in) {
		
		java.time.OffsetDateTime out = null;
		
		if(in != null)
			out = in.toInstant().atOffset(java.time.ZoneOffset.UTC);
		
		return out;
	}
	
	/**
	 * @param in
	 * @return {@link Date}
	 */
	public static Date convert(OffsetDateTime in) {
		
		Date out = null;
		
		if(in != null)
			out = Date.from(in.toInstant());
		
		return out;
	}
}