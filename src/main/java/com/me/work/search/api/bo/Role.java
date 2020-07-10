package com.me.work.search.api.bo;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import lombok.Data;

@Document(createIndex=true, indexName="roles", type="role")
//@Setting(settingPath="/settings/settings.json")
@Data
public class Role {

	@Id
	private String id;
	
	@Field(type=FieldType.Text, analyzer="filter_lowercase")
	private String name;
	
	@lombok.EqualsAndHashCode.Exclude
	private Date creationDate;
	
	public static enum RoleNameEnum {
		
		OFFENSIVE_WARRIOR,
		REMOTE_ASSASSIN;
		
		@Override
		public String toString() {
			return this.name();
		}
	}
}