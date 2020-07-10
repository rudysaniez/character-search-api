package com.me.work.search.api.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import lombok.Data;

@Document(createIndex=true, indexName="spells", type="spell")
//@Setting(settingPath="/settings/settings.json")
@Data
public class Spell implements Serializable {

	@Id
	private String id;
	
	@Field(type=FieldType.Text, analyzer="filter_lowercase")
	private String name;
	
	@lombok.EqualsAndHashCode.Exclude
	private String controlType;
	
	@lombok.EqualsAndHashCode.Exclude
	private int basicDamage;
	
	@lombok.EqualsAndHashCode.Exclude
	private int upByLevel;
	
	@lombok.EqualsAndHashCode.Exclude
	private int iterationNumber = 1;
	
	@lombok.EqualsAndHashCode.Exclude
	private String effectArea;
	
	@lombok.EqualsAndHashCode.Exclude
	private List<Key> keys;
	
	@lombok.EqualsAndHashCode.Exclude
	private List<Range> ranges;
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * @return list of {@link Key}
	 */
	public List<Key> getKeys() {
		
		if(this.keys == null)
			this.keys = new ArrayList<>();
		
		return this.keys;
	}
	
	/**
	 * @return list of {@link Range}
	 */ 
	public List<Range> getRanges() {
		
		if(this.ranges == null)
			this.ranges = new ArrayList<>();
		
		return this.ranges;
	}
	
	public static enum ControlTypeEnum {
		
		IMMOBILIZATION,
		STUNNING,
		SILENCE,
		SLEEPING,
		SLOWDOWN,
		ENSLAVED,
		NONE;
		
		@Override
		public String toString() {
			return this.name();
		}
	}
	
	public static enum EffectAreaEnum {
		
		CIRCLE,
		SEMI_CIRCLE,
		LINE,
		HAND_TO_HAND,
		TRIANGLE,
		CONE;
		
		@Override
		public String toString() {
			return this.name();
		}
		
	}
	
	public static enum SpellNameEnum {
		
		SKELETAL_STRIKE,
		FLASH_OF_FROST,
		BLIZZARD,
		CONE_OF_COLD;
		
		@Override
		public String toString() {
			return this.name();
		}
	}
}