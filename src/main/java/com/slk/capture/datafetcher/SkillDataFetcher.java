package com.slk.capture.datafetcher;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.slk.capture.model.Skill;
import com.slk.capture.repo.SkillRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class SkillDataFetcher implements DataFetcher<Skill>{

	@Autowired
	private SkillRepository skillRepository;

	@Override
	public Skill get(DataFetchingEnvironment env) {
		Map<String, Object> arg = env.getArguments();
		return skillRepository.findOne((Long) arg.get("graphId"));
	}

}
