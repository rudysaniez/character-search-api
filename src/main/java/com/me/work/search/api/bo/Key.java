package com.me.work.search.api.bo;

import lombok.Data;

@Data
public class Key {

	private String name;
	
	public static enum KeyEnum {
		
		A,Z,E,R;
		
		@Override
		public String toString() {
			return this.name();
		}
	}
}