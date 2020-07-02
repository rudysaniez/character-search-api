package com.me.work.search.api.bo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Life implements Serializable {

	private Integer minimumLife;
	
	private Integer upByLevel;
	
	private static final long serialVersionUID = 1L;
}