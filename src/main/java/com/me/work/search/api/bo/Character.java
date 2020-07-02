package com.me.work.search.api.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import lombok.Data;

@Document(createIndex=true, indexName="characters", type="character")
@Setting(settingPath="/settings/settings.json")
@Data
public class Character {

	@Id
	private String id;
	
	@Field(type=FieldType.Text, analyzer="filter_lowercase")
	private String name;
	
	@lombok.EqualsAndHashCode.Exclude
	private Date creationDate;
	
	@lombok.EqualsAndHashCode.Exclude
	private Role role;

	@lombok.EqualsAndHashCode.Exclude
	private Life life;
	
	@lombok.EqualsAndHashCode.Exclude
	private List<Spell> spells;
	
	/**
	 * @return list of {@link Spell}
	 */
	public List<Spell> getSpells() {
		
		if(this.spells == null)
			this.spells = new ArrayList<>();
		
		return this.spells;
	}
	
	public static enum CharacterNameEnum {
		
		LEORIC, JAINA, CASSIA, RAYNOR;
		
		@Override
		public String toString() {
			return this.name();
		}
	}
}