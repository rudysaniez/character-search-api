package com.me.work.search.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.me.work.search.api.bo.Character;

public interface CharacterRepository extends ElasticsearchRepository<Character, String> {

	/**
	 * @param name
	 * @param p
	 * @return
	 */
	@Query(value="{\"query_string\": {\"fuzziness\": \"AUTO\", \"analyze_wildcard\": true, "
			+ "\"minimum_should_match\": \"80%\","
			+ "\"query\": \"(factoryName:?0~) OR (factoryName:*?0*)\"}}")
	public Page<Character> findByName(String name, Pageable p);
}