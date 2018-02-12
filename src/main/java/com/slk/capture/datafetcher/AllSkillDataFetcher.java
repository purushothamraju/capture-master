package com.slk.capture.datafetcher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.slk.capture.model.Skill;
import com.slk.capture.repo.SkillRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class AllSkillDataFetcher implements DataFetcher<List<Skill>>{

	@Autowired
	private SkillRepository skillRepository;
	
	@Override
	public List<Skill> get(DataFetchingEnvironment env) {
		return (List<Skill>) skillRepository.findAll();
	}

}
