package com.me.work.search.api.bo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Range implements Serializable {

	private Double shootingRange;
	
	@lombok.EqualsAndHashCode.Exclude
	private Date createDate;
	
	private static final long serialVersionUID = 1L;
}